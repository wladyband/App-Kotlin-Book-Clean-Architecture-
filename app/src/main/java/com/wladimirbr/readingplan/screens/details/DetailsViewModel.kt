package com.wladimirbr.readingplan.screens.details


import androidx.lifecycle.ViewModel
import com.wladimirbr.readingplan.model.Item
import com.wladimirbr.readingplan.repository.BookRepository
import com.wladimirbr.readingplan.repository.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor(private val repository: BookRepository)

    : ViewModel(){
    suspend fun getBookInfo(bookId: String): Resource<Item> {
        return repository.getBookInfo(bookId)
    }
}