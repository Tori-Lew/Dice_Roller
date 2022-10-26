package com.zybooks.diceroller

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class RollLengthDialogFragment : DialogFragment() {
    interface OnRollLengthSelectedListener {
        fun onRollLengthClick(which: Int)
    }

    private lateinit var listener: OnRollLengthSelectedListener

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(requireActivity())
        builder.setTitle(R.string.pick_roll_length)
        builder.setItems(R.array.length_array) { dialog, which ->
            // 'which' is the zero-based index position chosen
            listener.onRollLengthClick(which)
        }
        return builder.create()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as OnRollLengthSelectedListener
    }
}