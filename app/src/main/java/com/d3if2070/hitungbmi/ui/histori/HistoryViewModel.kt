package com.d3if2070.hitungbmi.ui.histori

import androidx.lifecycle.ViewModel
import com.d3if2070.hitungbmi.db.BmiDao

class HistoryViewModel(db: BmiDao): ViewModel() {
    val data = db.getLastBmi()
}