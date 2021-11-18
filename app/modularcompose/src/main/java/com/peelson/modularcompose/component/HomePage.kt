package com.peelson.modularcompose.component

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.peelson.modularcompose.MainViewModel
import com.peelson.modularcompose.component.theme.white
import com.peelson.modularcompose.entries.Pet

/**
 *  主界面
 *
 *  @author peelson
 *  @date 2021/11/18
 */

@Composable
fun HomePage(viewModel: MainViewModel) {
    Column(
        Modifier
            .background(white)
            .fillMaxSize()
    ) {
        LazyColumn(Modifier.background(white)) {
            itemsIndexed(viewModel.myPets) { index, pet ->
                PetItem(pet = pet)
                if (index < viewModel.myPets.lastIndex) {
                    Divider(
                        color = Color.Gray,
                        thickness = 0.8f.dp
                    )
                }
            }
        }
    }

}

@Composable
private fun PetItem(pet: Pet) {
    val context = LocalContext.current
    val viewModel: MainViewModel = viewModel()
    Row(Modifier.clickable {
        Toast.makeText(context, viewModel.noun(pet = pet), Toast.LENGTH_SHORT).show()
    }) {
        Column(
            Modifier
                .weight(1f)
                .padding(20.dp)
                .align(Alignment.CenterVertically)
        ) {
            Text(
                text = pet.name,
                color = Color.Black,
                fontSize = 17.sp
            )
            Text(
                text = "年龄：${pet.age}岁",
                color = Color.Black,
                fontSize = 14.sp,
                modifier = Modifier.padding(top = 10.dp)
            )
        }
        Text(
            text = pet.species,
            fontSize = 24.sp,
            modifier = Modifier.padding(20.dp).align(Alignment.CenterVertically)
        )
    }
}