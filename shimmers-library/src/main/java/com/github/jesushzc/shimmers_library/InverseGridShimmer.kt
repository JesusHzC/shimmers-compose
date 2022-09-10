package com.github.jesushzc.shimmers_library

import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * @author jesushzc
 * @since 2021-08-10
 * @version 1.0
 * @param shape: Form Shape of first element
 * @param totalElements: Total elements of the list
 * @param animationDuration: Duration of the animation
 * @param modifier: Modifier
 * @param repeatMode: Repeat mode of the animation
 */
@Composable
fun InverseGridShimmer(
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape,
    totalElements: Int = 1,
    animationDuration: Int = 500,
    repeatMode: RepeatMode = RepeatMode.Restart,
) {
    val shimmerColors = listOf(
        Color.LightGray.copy(alpha = 0.6f),
        Color.LightGray.copy(alpha = 0.2f),
        Color.LightGray.copy(alpha = 0.6f),
    )

    val transition = rememberInfiniteTransition()
    val translateAnim = transition.animateFloat(
        initialValue = 0f,
        targetValue = 1000f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = animationDuration,
                easing = FastOutSlowInEasing
            ),
            repeatMode = repeatMode
        )
    )

    val brush = Brush.linearGradient(
        colors = shimmerColors,
        start = Offset.Zero,
        end = Offset(x = translateAnim.value, y = translateAnim.value)
    )

    LazyColumn(
        modifier = modifier.fillMaxWidth()
    ) {
        items(totalElements) {
            ShimmerGridItem (
                brush = brush,
                shape = shape
            )
        }
    }
}

@Composable
private fun ShimmerGridItem(
    brush: Brush,
    shape: Shape
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = 10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(verticalArrangement = Arrangement.Center) {
            Spacer(
                modifier = Modifier
                    .height(20.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .fillMaxWidth(fraction = 0.5f)
                    .background(brush)
            )
            Spacer(modifier = Modifier.padding(5.dp))
            Spacer(
                modifier = Modifier
                    .height(20.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .fillMaxWidth(fraction = 0.7f)
                    .background(brush)
            )
            Spacer(modifier = Modifier.padding(5.dp))
            Spacer(
                modifier = Modifier
                    .height(20.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .fillMaxWidth(fraction = 0.5f)
                    .background(brush)
            )
        }
        Spacer(modifier = Modifier.width(10.dp))
        Spacer(
            modifier = Modifier
                .size(90.dp)
                .clip(shape)
                .background(brush)
        )
    }
}