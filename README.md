# Toaster
Minimal toast maker

## Preview
![00](https://user-images.githubusercontent.com/73052393/153617969-1274425f-1c00-4c2e-958e-2d860135e057.jpg)
![01](https://user-images.githubusercontent.com/73052393/153618117-6964b832-a8bb-4813-a30f-59c07ce8e459.jpg)
![02](https://user-images.githubusercontent.com/73052393/153618190-4589266d-30a5-46d2-ae19-5c108c10733f.jpg)

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
	implementation 'com.github.ashutosh2706:toaster:1.0.1'
}
```

## Usage

### Java
```
Toaster.makeToast(getApplicationContext(), "Hello World!!", Toaster.LENGTH_SHORT, Toaster.SUCCESS);
```
Last argument is the type of toast you want to show.

