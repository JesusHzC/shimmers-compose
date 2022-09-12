
# Shimmers for Jetpack Compose

## Add to your project

Add it in your root build.gradle at the end of repositories:

```bash
  allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

Add the dependency:

```bash
  dependencies {
	        implementation 'com.github.JesusHzC:shimmers-compose:1.0'
	}
```
  
## Usage/Examples

Examples with values by default (you can customize this values):

```kotlin
InverseGridShimmer(
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape,
    totalElements: Int = 1,
    animationDuration: Int = 500,
    repeatMode: RepeatMode = RepeatMode.Restart,
)
```
![inverse-shimmer](https://user-images.githubusercontent.com/111035803/189658696-6b919df5-374e-4ccd-a744-f8cfb9114044.png)

```kotlin
GridShimmer(
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape,
    totalElements: Int = 1,
    animationDuration: Int = 500,
    repeatMode: RepeatMode = RepeatMode.Restart,
)
```
![grid-shimmer](https://user-images.githubusercontent.com/111035803/189659043-6d573995-b447-4f86-8ff0-4e523f3f58e1.png)

```kotlin
LinesShimmer(
    modifier: Modifier = Modifier,
    totalElements: Int = 1,
    animationDuration: Int = 500,
    repeatMode: RepeatMode = RepeatMode.Restart,
)
```

![lines-shimmers](https://user-images.githubusercontent.com/111035803/189659629-2ca70d93-033d-412b-85bd-091bd6ec8bd7.png)

```kotlin
SingleShapeShimmer(
    modifier: Modifier = Modifier,
    shape: Shape = CircleShape,
    animationDuration: Int = 500,
    repeatMode: RepeatMode = RepeatMode.Restart,
)
```
![singleshape](https://user-images.githubusercontent.com/111035803/189659632-c51ee419-41e6-4984-add7-f2054bba8cb9.png)

```kotlin
SingleLineShimmer(
    modifier: Modifier = Modifier,
    animationDuration: Int = 500,
    repeatMode: RepeatMode = RepeatMode.Restart,
)
```
![singleline](https://user-images.githubusercontent.com/111035803/189659633-51bded3d-3e83-476b-a5f8-a42371cfb2ff.png)
