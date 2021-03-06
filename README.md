[![](https://jitpack.io/v/haseebazeem15/UGImageViewer.svg)](https://jitpack.io/#haseebazeem15/UGImageViewer)

# UGImageViewer
UGImageViewer is full image view library with built-in zooming effects to each image with image slider.

# Description
UGImageViewer allows you to display your images in full sliding view with zooming effects. It supports HTTPS image loading as well as local image URIs.


## Demo

<p float="left">
  <img src="https://github.com/haseebazeem15/UGImageViewer/blob/master/demo1.jpeg" width="300"/>
  <img src="https://github.com/haseebazeem15/UGImageViewer/blob/master/demo2.jpeg" width="300" /> 
  <img src="https://github.com/haseebazeem15/UGImageViewer/blob/master/demo.gif" width="300" />
</p>

## Minimum API LEVEL
UGImageViewer is compatible with API LEVEL 19 or above.

## Installation

1) Use [jitpack](https://jitpack.io) in your build.gradle file to install UGImageViewer.

```bash
allprojects {
 repositories {
   maven { url 'https://jitpack.io' }
 }
}
```
## Gradle
```bash
dependencies {
   implementation 'com.github.haseebazeem15:UGImageViewer:1.0'
}
```

## Usage

Create this GifImageView element in your layout xml file:

```java
  // Create Image Path/URI Array List
  ArrayList<String> arrayList = new ArrayList<>();
  arrayList.add("IMAGE_PATH_1");
  arrayList.add("IMAGE_PATH_2");

  // Call builder to display ImageViewer
  UGImageViewer.Builder(this, arrayList).show();
```
UGImageViewer Builders:
```java
// Using ArrayList<String>
UGImageViewer.Builder(this, arrayList).show();

// Using ArrayList<Uri>
UGImageViewer.Builder(this, arrayList).show();

// or using image postition in adapter
UGImageViewer.Builder(this, arrayList, position).show();
```

## Libraries Used
UGImageViewer is using my own [ZImageView Library](https://github.com/haseebazeem15/ZImageView) (for zooming effect) and Picasso (for Image Loading)

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)

