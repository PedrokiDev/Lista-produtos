package br.com.alura.orgs.extensions

import android.widget.ImageView
import br.com.alura.orgs.R
import coil.load

fun ImageView.tentaCarregarImagem(url: String? = null, fallback: Int = R.drawable.image) {
    load(url) {
        fallback(fallback)
        error(R.drawable.error)
        placeholder(R.drawable.placeholder)
    }
}
