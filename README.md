# Toaster
Minimal toast maker

## Preview
<p align="left">
<img src="/snapshots/5.jpg" width="330">
<img src="/snapshots/1.jpg" width="330">
<img src="/snapshots/2.jpg" width="330">
<img src="/snapshots/3.jpg" width="330">
<img src="/snapshots/4.jpg" width="330">
</p>

## Gradle Integration

> Step 1. Add the JitPack repository to your build file

```gradle
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

> Step 2. Add the dependency

```gradle
dependencies {
	implementation 'com.github.ashutosh2706:toaster:1.0.2'
}
```

## Usage

### Java
```
Toaster.makeToast(getApplicationContext(), "Hello World!!", Toaster.LENGTH_SHORT, Toaster.SUCCESS);
```
Last argument is the type of toast you want to show.

