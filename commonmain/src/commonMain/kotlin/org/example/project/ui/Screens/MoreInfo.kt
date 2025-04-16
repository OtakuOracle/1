package org.example.project.ui.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import org.example.project.ViewModel.TimerViewModel
import org.example.project.components.defaultBottomBar


class MoreInfoScreen(private val timerViewModel: TimerViewModel) : Screen {

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow

        val buttonSize = Modifier
            .width(300.dp)
            .height(80.dp)

        Scaffold(
            topBar = { InfoTopBar() },
            bottomBar = { defaultBottomBar(timerViewModel = timerViewModel) }
        ) { paddingValues ->
            Box(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Подробная информация",
                        color = Color.DarkGray,
                        textAlign = TextAlign.Center,
                        fontSize = MaterialTheme.typography.h5.fontSize,
                    )

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(
                            modifier = Modifier
                                .weight(1f)
                                .padding(end = 8.dp),
                            verticalArrangement = Arrangement.spacedBy(16.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Button(
                                onClick = { navigator.push(InfoAboutMarafon(timerViewModel)) },
                                modifier = buttonSize,
                                colors = ButtonDefaults.buttonColors(
                                    backgroundColor = Color.LightGray,
                                    contentColor = Color.Black
                                ),
                                shape = RoundedCornerShape(15.dp)
                            ) {
                                Text(
                                    text = "Marathon Skills 2016", fontSize = 16.sp,
                                    fontStyle = FontStyle.Italic
                                )
                            }

                            Button(
                                onClick = { },
                                modifier = buttonSize,
                                colors = ButtonDefaults.buttonColors(
                                    backgroundColor = Color.LightGray,
                                    contentColor = Color.Black
                                ),
                                shape = RoundedCornerShape(15.dp)
                            ) {
                                Text(
                                    text = "Предыдущие\nрезультаты", fontSize = 16.sp,
                                    fontStyle = FontStyle.Italic
                                )
                            }

                            Button(
                                onClick = { },
                                modifier = buttonSize,
                                colors = ButtonDefaults.buttonColors(
                                    backgroundColor = Color.LightGray,
                                    contentColor = Color.Black
                                ),
                                shape = RoundedCornerShape(15.dp)
                            ) {
                                Text(
                                    text = "BMI калькулятор", fontSize = 16.sp,
                                    fontStyle = FontStyle.Italic
                                )
                            }
                        }

                        Column(
                            modifier = Modifier
                                .weight(1f)
                                .padding(end = 8.dp),
                            verticalArrangement = Arrangement.spacedBy(16.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Button(
                                onClick = { },
                                modifier = buttonSize,
                                colors = ButtonDefaults.buttonColors(
                                    backgroundColor = Color.LightGray,
                                    contentColor = Color.Black
                                ),
                                shape = RoundedCornerShape(15.dp)
                            ) {
                                Text(
                                    text = "Насколько долгий\nмарафон", fontSize = 16.sp,
                                    fontStyle = FontStyle.Italic
                                )
                            }

                            Button(
                                onClick = { },
                                modifier = buttonSize,
                                colors = ButtonDefaults.buttonColors(
                                    backgroundColor = Color.LightGray,
                                    contentColor = Color.Black
                                ),
                                shape = RoundedCornerShape(15.dp)
                            ) {
                                Text(
                                    text = "Список\nблаготворительных\nорганизаций",
                                    fontSize = 16.sp,
                                    fontStyle = FontStyle.Italic
                                )
                            }

                            Button(
                                onClick = { },
                                modifier = buttonSize,
                                colors = ButtonDefaults.buttonColors(
                                    backgroundColor = Color.LightGray,
                                    contentColor = Color.Black
                                ),
                                shape = RoundedCornerShape(15.dp)
                            ) {
                                Text(
                                    text = "BMR калькулятор", fontSize = 16.sp,
                                    fontStyle = FontStyle.Italic
                                )
                            }
                        }
                    }
                }
            }
        }
    }

    @Composable
    private fun InfoTopBar() {
        val navigator = LocalNavigator.currentOrThrow

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.DarkGray)
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Button(
                onClick = { navigator.pop() },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.LightGray,
                    contentColor = Color.Black
                ),
                elevation = null,
                shape = RoundedCornerShape(15.dp),
                modifier = Modifier
                    .wrapContentWidth()

            ) {
                Text(
                    text = "Назад",
                    color = Color.Black,
                )
            }

            Spacer(modifier = Modifier.width(24.dp))

            Text(
                text = "MARATHON SKILLS 2016",
                style = MaterialTheme.typography.h6,
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Left,
                fontWeight = FontWeight.Bold,
                fontSize = MaterialTheme.typography.h4.fontSize,
                color = Color.White
            )

            Spacer(modifier = Modifier.width(64.dp))
        }
    }

}