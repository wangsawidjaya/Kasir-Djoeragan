# Kasir Djoeragan - Setup Guide

## Prerequisites
- Android Studio 2022.1 or newer
- Android SDK API Level 24 (Android 7.0) or higher
- Kotlin 1.9.x or newer
- Java 17 or newer

## Project Setup

### 1. Clone Repository
```bash
git clone https://github.com/wangsawidjaya/Kasir-Djoeragan.git
cd Kasir-Djoeragan
```

### 2. Open in Android Studio
1. Open Android Studio
2. Select "Open an existing Android Studio project"
3. Navigate to the cloned directory and select it
4. Wait for Gradle sync to complete

### 3. Sync Gradle
- Android Studio should automatically trigger Gradle sync
- If not, go to File → Sync Now
- Wait for all dependencies to download

### 4. Run the Application

#### On Emulator
1. Open AVD Manager (Tools → Device Manager)
2. Create or select an emulator running Android 7.0 (API 24) or higher
3. Start the emulator
4. Click "Run" button or press Shift + F10

#### On Physical Device
1. Enable Developer Mode on your Android device
2. Connect device via USB
3. Click "Run" button
4. Select your device from the list

### 5. Build APK

#### Debug APK
```bash
./gradlew assembleDebug
```
APK will be available at: `app/build/outputs/apk/debug/`

#### Release APK
```bash
./gradlew assembleRelease
```
APK will be available at: `app/build/outputs/apk/release/`

## Project Structure

```
Kasir-Djoeragan/
├── app/
│   ├── src/main/
│   │   ├── java/com/djoeragan/kasir/
│   │   │   ├── data/              # Data layer (Database, Repository)
│   │   │   │   ├── database/      # Room database setup
│   │   │   │   ├── repository/    # Repository pattern
│   │   │   │   └── models/        # Data models
│   │   │   ├── domain/            # Domain layer (Business logic)
│   │   │   │   └── model/         # Domain models
│   │   │   ├── presentation/      # UI layer (Compose)
│   │   │   │   ├── home/          # Home screen
│   │   │   │   ├── products/      # Products screen
│   │   │   │   ├── transactions/  # Transactions screen
│   │   │   │   └── theme/         # App theme
│   │   │   ├── di/                # Dependency Injection (Hilt)
│   │   │   ├── MainActivity.kt    # Main activity
│   │   │   └── KasirApp.kt        # Application class
│   │   └── res/                   # Resources (strings, colors, etc)
│   └── build.gradle.kts           # Module gradle configuration
├── build.gradle.kts               # Project gradle configuration
└── settings.gradle.kts            # Gradle settings

```

## Architecture

This project follows **Clean Architecture** with **MVVM** pattern:

### Layers
1. **Data Layer** - Database operations, repositories
2. **Domain Layer** - Business logic, models
3. **Presentation Layer** - UI, ViewModels

### Key Technologies
- **Jetpack Compose** - Modern UI toolkit
- **Room Database** - Local data persistence
- **Hilt** - Dependency injection
- **Flow & Coroutines** - Async programming
- **Material 3** - Design system

## Building and Testing

### Run Tests
```bash
./gradlew test
```

### Run Connected Tests (on device/emulator)
```bash
./gradlew connectedAndroidTest
```

## Troubleshooting

### Gradle Sync Fails
- Clear cache: File → Invalidate Caches → Invalidate and Restart
- Update Gradle: gradle/wrapper/gradle-wrapper.properties

### Build Fails
- Check Java version: `java -version` (should be 17+)
- Update SDK: SDK Manager → Update all
- Clean and rebuild: `./gradlew clean build`

### APK Installation Fails
- Clear app data: `adb shell pm clear com.djoeragan.kasir`
- Uninstall previous version: `adb uninstall com.djoeragan.kasir`

## Next Steps

1. Implement transaction screen
2. Add product management screen
3. Implement Bluetooth printer support
4. Add reporting features
5. Implement cloud sync
6. Add authentication

For more information, see [FEATURES.md](FEATURES.md) and [USAGE.md](USAGE.md)
