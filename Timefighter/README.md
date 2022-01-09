### Theory behind bundles and Intents
#### Intents
* We can start another activity using an intent.

#### Bundles
* Bundles are generally used to pass the data between activities.
* It's a mapping of string values to different parcelable types.
* We can pass the data with an intent
```kotlin
    intent = Intent(context, SecondActivity::class.java)
    intent.putExtra("key",value)
```
* We can receive the extras in a bundle
```kotlin
    data:String = intent?.extras?.getString("key").toString()
```

### Activity Stack
* Whenever we open a new activity it comes on the top of the activity stack.
* The previous activity is not destroyed however it goes in the stopped mode after calling the onPause() and onStop() methods.

### What is this application for?
This application an small example which make use of intents and bundles. 