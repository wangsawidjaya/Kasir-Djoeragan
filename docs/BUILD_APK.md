# Build APK - Panduan Lengkap

## 📦 Apa itu APK?

APK (Android Package) adalah file yang dapat diinstal langsung ke handphone Android tanpa perlu Android Studio.

Keuntungan:
- ✅ Bisa dibagikan ke orang lain
- ✅ Bisa diinstall kapan saja tanpa PC
- ✅ Bisa disimpan sebagai backup
- ✅ Ukuran file kecil (~20-50MB)

---

## 🔨 Cara Build APK

### Step 1: Buka Terminal

**Windows:**
- Buka Command Prompt / PowerShell
- Navigate ke folder Kasir-Djoeragan

**Mac/Linux:**
- Buka Terminal
- Navigate ke folder Kasir-Djoeragan

```bash
cd /path/to/Kasir-Djoeragan
```

### Step 2: Build APK dengan Gradle

#### Pilihan A: Debug APK (Recommended untuk Testing)

```bash
./gradlew assembleDebug
```

**Karakteristik:**
- Ukuran: ~30-50MB
- Bisa untuk testing
- Tidak signed secara production
- Build lebih cepat (1-2 menit)

#### Pilihan B: Release APK (Untuk Production)

```bash
./gradlew assembleRelease
```

**Karakteristik:**
- Ukuran: ~15-25MB
- Optimized untuk production
- Signed dengan signing key
- Build lebih lama (2-3 menit)

### Step 3: Tunggu Build Selesai

```
BUILD SUCCESSFUL in 1m 45s
```

Saat build sedang berjalan, Anda akan melihat:
```
> Task :app:compileDebugKotlin
> Task :app:packageDebug
> Task :app:assembleDebug

✅ BUILD SUCCESSFUL
```

---

## 📍 Lokasi File APK

Setelah build selesai, file APK berada di:

### Debug APK:
```
Kasir-Djoeragan/app/build/outputs/apk/debug/app-debug.apk
```

### Release APK:
```
Kasir-Djoeragan/app/build/outputs/apk/release/app-release.apk
```

---

## 🚀 Install APK ke Handphone

### Metode 1: Via Android Studio (Paling Mudah)

Setelah build selesai:

1. Di Android Studio, connect handphone via USB
2. Klik tombol **"Run"** (▶)
3. Pilih handphone Anda
4. Aplikasi akan otomatis install dan jalankan

### Metode 2: Via ADB Command

```bash
# Install debug APK
adb install app/build/outputs/apk/debug/app-debug.apk

# Output:
# Success
```

### Metode 3: Manual (Tanpa PC)

**Step A: Copy APK ke Handphone**

**Cara 1 - Drag & Drop (Windows/Mac):**
1. Buka File Explorer / Finder
2. Navigate ke: `app/build/outputs/apk/debug/`
3. Cari file `app-debug.apk`
4. Sambungkan handphone via USB (mode file transfer)
5. Drag file APK ke folder **Downloads** di handphone
6. Disconnect handphone

**Cara 2 - Via Email/Cloud:**
1. Pindahkan file APK ke Google Drive / OneDrive
2. Buka di handphone
3. Download file
4. Buka file untuk install

**Step B: Install di Handphone**

1. Buka **File Manager** / **Files** di handphone
2. Navigate ke folder **Downloads**
3. Tap file `app-debug.apk`
4. Jika ada popup "Unknown sources", tap **"Settings"** → Enable "Unknown sources"
5. Kembali ke File Manager dan tap APK lagi
6. Tap **"Install"**
7. Tunggu instalasi selesai (10-30 detik)
8. Tap **"Open"** atau cari icon aplikasi di home screen

---

## 📋 Troubleshooting Build

### Error: "Build failed"

**Solusi:**

1. **Clean build dulu:**
   ```bash
   ./gradlew clean
   ./gradlew assembleDebug
   ```

2. **Check Java version:**
   ```bash
   java -version
   # Harus Java 17 atau lebih tinggi
   ```

3. **Update Gradle:**
   ```bash
   ./gradlew wrapper --gradle-version=8.0
   ```

### Error: "Gradle sync failed"

**Solusi:**
```bash
# Invalidate cache
rm -rf .gradle

# Rebuild
./gradlew clean build
```

### Error: "Out of memory"

**Solusi:**
```bash
# Tambah memory untuk Gradle
export GRADLE_OPTS="-Xmx4096m"
./gradlew assembleDebug
```

### File APK tidak ditemukan

**Solusi:**
1. Pastikan build sudah selesai dengan status **"BUILD SUCCESSFUL"**
2. Cek folder: `app/build/outputs/apk/debug/` atau `app/build/outputs/apk/release/`
3. Jika tidak ada, build ulang dari awal

---

## 📱 Installasi APK di Handphone

### Prerequisites

1. **Enable Unknown Sources:**
   - Settings → Apps & notifications → Special app access → Install unknown apps
   - Tap file manager / browser yang Anda gunakan
   - Aktifkan "Allow from this source"

2. **Minimal Android Version:**
   - Handphone harus Android 7.0 (API 24) atau lebih tinggi
   - Cek di: Settings → About phone → Android version

3. **Storage Cukup:**
   - Minimal 200MB free space
   - Cek di: Settings → Storage

### Install Langkah Demi Langkah

1. **Copy APK ke handphone**
   - Via USB drag-drop, email, cloud, atau Bluetooth

2. **Buka File Manager di handphone**
   - Cari file `app-debug.apk`

3. **Tap file APK**
   ```
   [app-debug.apk]
        ↓
   "Do you want to install this app?"
        ↓
   [INSTALL] [CANCEL]
   ```

4. **Tap INSTALL**
   - Progress bar akan muncul
   - Tunggu sampai 100%

5. **Setelah selesai**
   - Tap **"Open"** untuk jalankan
   - Atau cari di app drawer (icon Kasir Djoeragan)

---

## ✅ Verifikasi Instalasi

Setelah install selesai, pastikan:

1. **App icon muncul di home screen** ✅
2. **Bisa dibuka** ✅
3. **Dashboard tampil dengan baik** ✅
4. **Tidak ada error/crash** ✅

---

## 🔄 Update Aplikasi

Jika sudah ada versi APK lama di handphone:

### Cara 1: Uninstall versi lama dulu
```bash
adb uninstall com.djoeragan.kasir
```

### Cara 2: Langsung install APK baru
```bash
adb install -r app/build/outputs/apk/debug/app-debug.apk
```

Flag `-r` artinya replace/overwrite versi lama.

---

## 📊 Ukuran File APK

Perkiraan ukuran file berdasarkan type build:

| Type | Size | Waktu Build |
|------|------|------------|
| Debug APK | 30-50 MB | 1-2 menit |
| Release APK | 15-25 MB | 2-3 menit |

**Catatan:** Ukuran tergantung dependencies yang digunakan. Semakin banyak library, semakin besar file APK.

---

## 💾 Sharing APK

Setelah build APK, Anda bisa membagikannya:

### Cara 1: Langsung File
- Share file `app-debug.apk` ke orang lain
- Mereka bisa langsung install di handphone

### Cara 2: Via Cloud
- Upload ke Google Drive
- Share link ke orang lain
- Mereka download dan install

### Cara 3: Compress & Share
```bash
# Compress file
zip app-debug.apk.zip app/build/outputs/apk/debug/app-debug.apk

# Sekarang bisa share file .zip lebih mudah
```

---

## 🎯 Checklist Build & Install

- [ ] Build APK selesai dengan status "BUILD SUCCESSFUL"
- [ ] File APK ditemukan di folder output
- [ ] Handphone mendukung Android 7.0+
- [ ] Unknown sources sudah diaktifkan
- [ ] Storage handphone cukup
- [ ] APK sudah di-copy ke handphone
- [ ] APK berhasil diinstall
- [ ] Aplikasi bisa dibuka dan jalan normal

---

## 🚀 Next Steps

Setelah APK berhasil install di handphone:

1. **Test semua fitur** - Pastikan semuanya berjalan normal
2. **Report bug** - Jika ada error, buat GitHub Issue
3. **Development** - Lanjutkan implement fitur berikutnya
4. **Rebuild & Install** - Setiap kali ada perubahan code

---

## 📞 Bantuan

Jika ada masalah:
1. Cek file: `docs/INSTALL_PHONE.md`
2. Buka GitHub Issues: https://github.com/wangsawidjaya/Kasir-Djoeragan/issues
3. Tanya di GitHub Discussions

**Good luck! 🚀**
