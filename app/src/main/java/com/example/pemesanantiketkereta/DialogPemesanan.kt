package com.example.pemesanantiketkereta

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import com.example.pemesanantiketkereta.databinding.DialogPemesananBinding

class DialogPemesanan(
    private val context: Context,
    private val nama: String,
    private val jam: String,
    private val tanggal: String,
    private val tujuan: String,
    private val harga: String
) : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(requireActivity())
        val inflater = requireActivity().layoutInflater
        val binding = DialogPemesananBinding.inflate(inflater)
        binding.Harga.text  = harga
        with(binding) {
            btnBeli.setOnClickListener {
                val intent = Intent(requireActivity(), MainActivity2::class.java)
                intent.putExtra("nama", nama)
                intent.putExtra("jam", jam)
                intent.putExtra("tanggal", tanggal)
                intent.putExtra("tujuan", tujuan)
                intent.putExtra("harga", harga)
                context.startActivity(intent)
                dismiss()
            }

            btnBatal.setOnClickListener {
                dismiss()
            }
        }
        builder.setView(binding.root)
        return builder.create()
    }
}
