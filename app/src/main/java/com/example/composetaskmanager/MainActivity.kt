package com.example.composetaskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetaskmanager.ui.theme.ComposeTaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTaskManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                   TaskDoneColumn()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TaskDoneColumn(){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment =Alignment.CenterHorizontally
    ) {
        TaskCompleteImageCard()
        TitleText()
        SubTitleText()
    }
}

@Composable
fun TaskCompleteImageCard(){
    val imageResource = painterResource(id = R.drawable.ic_task_completed)
    Image(painter = imageResource, contentDescription = "Task Done Image")
}


@Composable
fun TitleText(modifier: Modifier = Modifier){
    Text(text = "All tasks completed",  fontWeight = FontWeight.Bold, modifier = modifier.padding(top = 24.dp, bottom = 8.dp))
}

@Composable
fun SubTitleText(modifier: Modifier = Modifier){
    Text(text = "Nice work!", fontSize = 16.sp,modifier=modifier)
}