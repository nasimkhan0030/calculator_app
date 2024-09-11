package com.example.calculator.ui.theme

import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val buttonList = listOf(
    "C","(",")","/",
    "7","8","9","*",
    "4","5","6","+",
    "1","2","3","-",
    "AC","0",".","="
)

@Composable
fun Calculator( modifier: Modifier= Modifier) {
Box(modifier = Modifier){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.End

    ) {
        Text(
            text = "123+123",
            style = TextStyle(
                fontSize =30.sp,
                textAlign = TextAlign.End
            ),
            maxLines = 5,
            overflow = TextOverflow.Ellipsis

        )
        Text(
            text = "246",
            style = TextStyle(
                fontSize =60.sp,
                textAlign = TextAlign.End
            ),
            maxLines = 5,

        )
        Spacer(modifier = Modifier.height(10.dp))
        LazyVerticalGrid(
            columns = GridCells.Fixed(4),
            ){
            items(buttonList) {
                CalculatorButton(btn = it)
            }
        }
    }
}
}

@Composable
fun CalculatorButton(btn :String) {
    Box(modifier = Modifier.padding(8.dp))
    FloatingActionButton(
        onClick = {  },
        modifier = Modifier.size(80.dp),
        shape = CircleShape,
        containerColor = getColor(btn),
        contentColor = Color.White
    ) {
        Text(text = btn)
        
    }
    
}

fun getColor(btn: String):Color{
    if( btn=="C" || btn =="AC")
        return Color(0xfff44336)
    if( btn=="(" || btn ==")")
        return Color.Gray
    if( btn=="/" || btn =="*"|| btn =="+"|| btn =="-"|| btn =="=")
        return Color(0xffff9800)
    return Color(0xFF34C2D4)

}

