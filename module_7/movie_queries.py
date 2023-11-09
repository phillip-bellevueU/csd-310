import mysql.connector
from mysql.connector import errorcode

config = {
    "user": "root",
    "password": "Pa55w0rd",
    "host" : "127.0.0.1",
    "database": "movies",
    "raise_on_warnings": True
}

try:
    db = mysql.connector.connect(**config)

    print("\n Database user {} connected to MySql on Host {} with database {}".format(config["user"], config["host"], config["database"]))

    input("\n\n Press any key to continue... \n")

except mysql.connector.Error as err:
    if err.errno == errorcode.ER_ACCESS_DENIED_ERROR:
        print(" The supplied username or password are invalid")

    elif err.errno == errorcode.ER_BAD_DB_ERROR:
        print(" The specified database does not exist")

    else:
        print(err)

#finally:
 #   db.close()

#init cursor
cursor = db.cursor()
#tell cursor what to do
cursor.execute("SELECT * FROM studio")  
movies = cursor.fetchall()
#header for query
print("-- DISPLAYING Studio RECORDS --")
#print query results
for studio in movies:
    
    print("Studio ID : {}\n Studio Name:{}\n".format(studio[0], studio[1])) 

#second query
cursor = db.cursor()

cursor.execute("SELECT * FROM genre")               
movies = cursor.fetchall()

print("-- DISPLAYING Genre RECORDS --")

for genre in movies:
    print("Genre ID : {}\n Genre Name:{}\n".format(genre[0], genre[1])) 

#third query
cursor = db.cursor()

cursor.execute("SELECT * FROM film WHERE film_runtime < 120")               
movies = cursor.fetchall()

print("-- DISPLAYING Short Film RECORDS --")

for film in movies:
    print("Film Name : {}\n Runtime :{}\n".format(film[1], film[3])) 

#final query
cursor = db.cursor()

cursor.execute("SELECT * FROM film ORDER BY film_director")               
movies = cursor.fetchall()

print("-- DISPLAYING Director RECORDS in Order --")

for film in movies:
    print("Film Name : {}\n Director:{}\n".format(film[1], film[4])) 