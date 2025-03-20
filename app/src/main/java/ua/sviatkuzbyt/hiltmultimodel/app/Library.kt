package ua.sviatkuzbyt.hiltmultimodel.app

import android.util.Log
import androidx.compose.material3.FabPosition
















data class Book(
    val name: String,
    val author: String,
    val genre: String,
    val price: Int
)

class Library(){
    private val books = mutableListOf<Book>()

    fun addBook(book: Book){
        books.add(book)
    }

    fun deleteBook(book: Book){
        books.remove(book)
    }

    fun changeBook(book: Book, position: Int){
        books[position] = book
    }

    fun logBooks(){
        books.forEach {
            Log.v("App-TAG", it.toString())
        }
    }
}