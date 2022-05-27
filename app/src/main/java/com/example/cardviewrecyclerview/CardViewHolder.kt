package com.example.cardviewrecyclerview

import androidx.recyclerview.widget.RecyclerView
import com.example.cardviewrecyclerview.databinding.CardCellBinding

class CardViewHolder(
    private val cardCellBinding: CardCellBinding,
    private val clickListener: BookClickListener
) : RecyclerView.ViewHolder(cardCellBinding.root) {
    fun bindBook(book: Book) {
        cardCellBinding.cardView.setImageResource(book.cover)
        cardCellBinding.title.text = book.title
        cardCellBinding.author.text = book.author

        cardCellBinding.cardView.setOnClickListener{
            clickListener.onClick(book)
        }
    }
}
