package com.sijan.thecomposecart

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sijan.thecomposecart.ui.theme.TheComposeCartTheme

class CounterActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TheComposeCartTheme {
                var count by remember {mutableStateOf(0)}
                Column(modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = count.toString(),
                    fontSize = 30.sp)
                    Button(onClick = {
                        count++
                    }) {
                        Text(text = "Click me")
                    }
                }
            }
        }
    }
}

/*@Composable
fun Greeting(name: String) {
//if (name.length>5) {
    LazyColumn(modifier = Modifier.fillMaxSize()){
//        for (i in 1..10){
        items(10){i ->
            Icon(
                imageVector = Icons.Default.ArrowDropDown,
                contentDescription = null,
                modifier = Modifier.size(100.dp)
            )
    }
}


*//*    Image(painter = painterResource(id = R.drawable.ic_launcher_foreground),
        contentDescription = null,
    )*//*

*//*    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
//        horizontalAlignment = Alignment.End,
//        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Hello $name!",
            fontSize = 30.sp,
            color = Color.Blue,
            modifier = Modifier.align(Alignment.BottomEnd)
        )
        Text(
            text = "Other Texts!",
            fontSize = 30.sp,
            color = Color.Blue
        )
    }*//*

}*/
