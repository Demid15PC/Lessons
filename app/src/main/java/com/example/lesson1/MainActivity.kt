package com.example.lesson1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.lesson1.ui.theme.Black100
import com.example.lesson1.ui.theme.Lesson1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val fontFamily = FontFamily(
                Font(R.font.unbounded_regular, FontWeight.Normal),
                Font(R.font.unbounded_light, FontWeight.Light),
                Font(R.font.unbounded_extralight, FontWeight.ExtraLight),
                Font(R.font.unbounded_medium, FontWeight.Medium),
                Font(R.font.unbounded_black, FontWeight.Black),
                Font(R.font.unbounded_bold, FontWeight.Bold),
                Font(R.font.unbounded_extrabold, FontWeight.ExtraBold),
                Font(R.font.unbounded_semibold, FontWeight.SemiBold),
            )
            Box(
                modifier = Modifier.fillMaxSize().background(Black100),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color.Green,
                                fontSize = 50.sp
                            )
                        ){
                            append("J")
                        }
                        append("etpa")
                        withStyle(
                            style = SpanStyle(
                                color = Color.LightGray
                            )
                        ){
                            append("ck ")
                        }
                        //Compose
                        withStyle(
                            style = SpanStyle(
                                color = Color.Green,
                                fontSize = 50.sp
                            )
                        ){
                            append("C")
                        }
                        append("ompo")
                        withStyle(
                            style = SpanStyle(
                                color = Color.LightGray
                            )
                        ){
                            append("se")
                        }
                    },
                    color = Color.White,
                    fontSize = 30.sp,
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.ExtraBold
                )
            }
        }
    }
}