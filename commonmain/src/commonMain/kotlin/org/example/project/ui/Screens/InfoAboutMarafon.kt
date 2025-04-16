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
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import org.example.project.ViewModel.TimerViewModel
import org.example.project.components.defaultBottomBar
import org.example.project.components.defaultTopBar
import javax.swing.text.AbstractDocument.Content

class InfoAboutMarafon(private val timerViewModel: TimerViewModel): Screen {
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow

        Scaffold(
            topBar = { defaultTopBar() },
            bottomBar = { defaultBottomBar(timerViewModel) }
        ) { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
                    .background(Color.White)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.Center)
                        .padding(horizontal = 30.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Информация о марафоне",
                        style = MaterialTheme.typography.h6,
                        color = Color.Black,
                        modifier = Modifier.padding(bottom = 32.dp)
                    )


                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Column(
                            modifier = Modifier.weight(1f)
                        ) {

                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(200.dp)
                                    .background(Color.LightGray)
                            ) {
                                Text(
                                    text = "Интерактивная карта",
                                    modifier = Modifier.align(Alignment.Center)
                                )
                            }

                            Spacer(modifier = Modifier.height(16.dp))


                            Column {

                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .weight(1f)
                                            .height(120.dp)
                                            .padding(end = 8.dp)
                                            .background(Color.Gray)
                                    ) {
                                        Text(
                                            text = "Фото 1",
                                            modifier = Modifier.align(Alignment.Center)
                                        )
                                    }
                                    Box(
                                        modifier = Modifier
                                            .weight(1f)
                                            .height(120.dp)
                                            .padding(start = 8.dp)
                                            .background(Color.Gray)
                                    ) {
                                        Text(
                                            text = "Фото 2",
                                            modifier = Modifier.align(Alignment.Center)
                                        )
                                    }
                                }

                                Spacer(modifier = Modifier.height(16.dp))


                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .weight(1f)
                                            .height(120.dp)
                                            .padding(end = 8.dp)
                                            .background(Color.Gray)
                                    ) {
                                        Text(
                                            text = "Фото 3",
                                            modifier = Modifier.align(Alignment.Center)
                                        )
                                    }
                                    Box(
                                        modifier = Modifier
                                            .weight(1f)
                                            .height(120.dp)
                                            .padding(start = 8.dp)
                                            .background(Color.Gray)
                                    ) {
                                        Text(
                                            text = "Фото 4",
                                            modifier = Modifier.align(Alignment.Center)
                                        )
                                    }
                                }
                            }
                        }

                        Spacer(modifier = Modifier.width(32.dp))


                        Column(
                            modifier = Modifier.weight(1f)
                        ) {
                            Text(
                                text = "Информация о Навыках Марафона 2016 пойдет сюда. Информация может покрыть расположение, время, расстояние, рекордные времена, достопримечательности, и т.д.\n",
                                modifier = Modifier.padding(bottom = 8.dp)
                            )

                            Text(
                                text = "Дополнительные сведения. Дополнительные сведения. Дополнительные сведения. Дополнительные сведения. Дополнительные сведения. Дополнительные сведения. Дополнительные сведения.",
                                modifier = Modifier.padding(bottom = 8.dp)
                            )

                            Text(
                                text = "Дополнительные сведения. Дополнительные сведения. Дополнительные сведения. Дополнительные сведения. Дополнительные сведения. Дополнительные сведения. Дополнительные сведения. Дополнительные сведения.",
                                modifier = Modifier.padding(bottom = 8.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}