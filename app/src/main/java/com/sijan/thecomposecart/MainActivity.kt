package com.sijan.thecomposecart

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import org.w3c.dom.NameList

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TheComposeCartTheme {
                var name by remember {
                    mutableStateOf("")
                }
                var names by remember {
                    mutableStateOf(listOf<String>())
                }
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        OutlinedTextField(
                            value = name, onValueChange ={ text ->
                                name= text
                            },
                        modifier = Modifier.weight(1f))
                        Spacer(modifier = Modifier.width(16.dp))
                        Button(onClick = {
                            if(name.isNotBlank()) {
                                names = names + name
                                name= ""
                            }
                        }) {
                            Text(text = "Add")
                        }
                    }
                    NameList(names = names)
                }

            }
        }
    }
}

@Composable
fun NameList(
    names: List<String>,
    modifier: Modifier= Modifier
){
    LazyColumn(modifier){
        items(names){ currName->
            Text(text = currName,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp))
        }
    }
}