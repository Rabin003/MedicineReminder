package com.example.medicineremainder;

import android.content.Context;

import androidx.annotation.NonNull;

import com.example.medicineremainder.data.source.MedicineRepository;
import com.example.medicineremainder.data.source.local.MedicinesLocalDataSource;

public class Injection {
    public static MedicineRepository provideMedicineRepository(@NonNull Context context) {
        return MedicineRepository.getInstance(MedicinesLocalDataSource.getInstance(context));
    }
}