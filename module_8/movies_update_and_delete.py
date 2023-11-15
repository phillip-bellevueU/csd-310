#Phillip Thoendel - Movies: Update & Deletes  - 11/15/2023
#quick reference path cd C:\csd\csd-310\module_8
                            # python movies_update_and_delete.py
#this script from a previous assignment allows for the connection of python with SQL
import mysql.connector
from mysql.connector import errorcode

#takes creds for db
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

       
#error codes for incorrect creds
except mysql.connector.Error as err:
    if err.errno == errorcode.ER_ACCESS_DENIED_ERROR:
        print(" The supplied username or password are invalid")

    elif err.errno == errorcode.ER_BAD_DB_ERROR:
        print(" The specified database does not exist")

    else:
        print(err)

##########################################################

#DISPLAYING FILMS function
def show_films(cursor, title) : #
    #method to run inner join on all tables

    #init cursor
    cursor = db.cursor()
    #inner join query syntax
    cursor.execute("""SELECT film_name AS Name, film_director as Director, genre_name AS Genre, studio_name AS 'Studio Name' 
                      FROM film 
                      INNER JOIN genre ON film.genre_id=genre.genre_id 
                      INNER JOIN studio ON film.studio_id=studio.studio_id """ )

    #get result from cursor object
    films = cursor.fetchall()
    print("\n -- {} --".format(title))

    #iterate and display results
    for film in films:
        print("Film Name: {}\nDirector: {}\nGenre Name ID: {}\nStudio Name: {}\n".format(film[0], film[1], film[2], film[3]))

#call DISPLAYING FILMS function       
cursor = db.cursor()
show_films(cursor, "DISPLAYING FILMS")
cursor.close() 

###########################################################
#INSERT
cursor = db.cursor()
cursor.execute("INSERT INTO film VALUES(4, 'The Martian', 2015, 144, 'Ridley Scott', 1, 2)")  #INSERT INTO film VALUES(4, 'The Martian', 2015, 144, 'Ridley Scott', 1, 2)
movies = cursor.fetchall()

#DISPLAYING FILMS AFTER INSERT function
def show_films(cursor, title) : #
    #method to run inner join on all tables

    #init cursor
    cursor = db.cursor()
    #inner join query syntax
    cursor.execute("""SELECT film_name AS Name, film_director as Director, genre_name AS Genre, studio_name AS 'Studio Name' 
                      FROM film 
                      INNER JOIN genre ON film.genre_id=genre.genre_id 
                      INNER JOIN studio ON film.studio_id=studio.studio_id """ )

    #get result from cursor object
    films = cursor.fetchall()
    print("\n -- {} --".format(title))

    #iterate and display results
    for film in films:
        print("Film Name: {}\nDirector: {}\nGenre Name ID: {}\nStudio Name: {}\n".format(film[0], film[1], film[2], film[3]))

#call DISPLAYING FILMS function       
cursor = db.cursor()
show_films(cursor, "DISPLAYING FILMS AFTER INSERT")
cursor.close() 

cursor = db.cursor()

#tell cursor what to do
cursor = db.cursor()
cursor.execute("SELECT * FROM studio")  
movies = cursor.fetchall()

###########################################################

#UPDATE
cursor = db.cursor()
cursor.execute("UPDATE film SET genre_id = 1 WHERE film_id = 2")  #UPDATE film SET genre_id = 1 WHERE film_id = 2;
movies = cursor.fetchall()

#DISPLAYING FILMS AFTER UPDATE CHanged alien to horror function
def show_films(cursor, title) : #
    #method to run inner join on all tables

    #init cursor
    cursor = db.cursor()
    #inner join query syntax
    cursor.execute("""SELECT film_name AS Name, film_director as Director, genre_name AS Genre, studio_name AS 'Studio Name' 
                      FROM film 
                      INNER JOIN genre ON film.genre_id=genre.genre_id 
                      INNER JOIN studio ON film.studio_id=studio.studio_id """ )

    #get result from cursor object
    films = cursor.fetchall()
    print("\n -- {} --".format(title))

    #iterate and display results
    for film in films:
        print("Film Name: {}\nDirector: {}\nGenre Name ID: {}\nStudio Name: {}\n".format(film[0], film[1], film[2], film[3]))

#call DISPLAYING FILMS function       
cursor = db.cursor()
show_films(cursor, "DISPLAYING FILMS AFTER UPDATE - Changed Alien to Horror")
cursor.close() 

###########################################################
#DELETE
cursor = db.cursor()
cursor.execute("DELETE FROM film WHERE film_id = 1")  #DELETE FROM film WHERE film_id = 1;
movies = cursor.fetchall()

#DISPLAYING FILMS AFTER DELETE
def show_films(cursor, title) : #
    #method to run inner join on all tables

    #init cursor
    cursor = db.cursor()
    #inner join query syntax
    cursor.execute("""SELECT film_name AS Name, film_director as Director, genre_name AS Genre, studio_name AS 'Studio Name' 
                      FROM film 
                      INNER JOIN genre ON film.genre_id=genre.genre_id 
                      INNER JOIN studio ON film.studio_id=studio.studio_id """ )

    #get result from cursor object
    films = cursor.fetchall()
    print("\n -- {} --".format(title))

    #iterate and display results
    for film in films:
        print("Film Name: {}\nDirector: {}\nGenre Name ID: {}\nStudio Name: {}\n".format(film[0], film[1], film[2], film[3]))

#call DISPLAYING FILMS function       
cursor = db.cursor()
show_films(cursor, "DISPLAYING FILMS AFTER DELETE")
cursor.close() 