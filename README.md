## 👋 Welcome to `kartest`

A sample Android project developed to showcase integration with the [CleverTap SDK](https://developer.clevertap.com/docs/android) as part of an onboarding technical evaluation.

---

## 🌐 Overview
This app demonstrates:

- Integration with CleverTap Android SDK (v7.3.1)
- Firebase Cloud Messaging (FCM) setup
- Sending user profile data
- Sending custom events with properties
- Basic UI using Jetpack Compose

---

## 📊 Features Implemented

### ✅ CleverTap SDK Integration
- Added via Gradle using version `7.3.1`
- Credentials (Account ID and Token) set via `AndroidManifest.xml`

### ✅ Firebase Cloud Messaging (FCM)
- Firebase configured using `google-services.json`
- Messaging SDK added via Firebase BoM
- Firebase plugin applied via `com.google.gms.google-services`
- Uses CleverTap's built-in `FcmMessageListenerService` to handle notifications

### ✅ User Profile Update
On button click, the app:
- Updates the user profile with name, email, gender, and phone

### ✅ Event Tracking
Also sends a custom event:
```kotlin
"Product Viewed" with properties like:
- Product ID
- Product Name
- Product Image
- Email ID
```

---

## 🔎 How to Run

### 1. Clone the repo:
```bash
git clone https://github.com/Karthen/kartest.git
```

### 2. Open in Android Studio
- Sync Gradle
- Connect to Firebase (or replace with your own `google-services.json`)

### 3. Run on emulator or device
- Click the "Product Viewed" button to trigger user update and event

---

## ❌ Known Issues

### ⚡ GCMMismatchSenderID
- When sending push notification via the CleverTap dashboard, an error appears: `GCMMismatchSenderID (1)`
- This is likely caused by a mismatch between:
  - The Firebase project used to generate `google-services.json`
  - And the Firebase Admin SDK JSON uploaded to the CleverTap Push configuration

> This will be discussed during the interview for further clarification.

---

## 🌟 Tech Stack
- Kotlin
- Jetpack Compose
- Firebase Cloud Messaging
- CleverTap Android SDK

---

