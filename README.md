# Kasir Djoeragan 💼

Aplikasi Kasir Android Modern untuk UMKM - Solusi POS (Point of Sale) yang mudah digunakan, cepat, dan handal.

## 🎯 Fitur Utama

- ✅ **Manajemen Produk** - Tambah, edit, hapus produk dengan mudah
- ✅ **Transaksi Penjualan** - Proses penjualan yang cepat dan intuitif
- ✅ **Manajemen Stok** - Tracking stok produk real-time
- ✅ **Laporan Penjualan** - Laporan harian, mingguan, bulanan
- ✅ **Print Receipt** - Print thermal printer Bluetooth
- ✅ **Multi-Kasir** - Manajemen multiple user/kasir
- ✅ **Dark Mode** - Tema gelap untuk kenyamanan mata
- ✅ **Offline Support** - Bekerja tanpa internet

## 🛠️ Tech Stack

- **Language:** Kotlin
- **UI Framework:** Jetpack Compose + Material 3
- **Database:** Room DB
- **Architecture:** Clean Architecture + MVVM
- **Async:** Coroutines + Flow
- **Dependency Injection:** Hilt
- **Network:** Retrofit (untuk sync cloud)

## 📱 Screenshot

_Screenshot akan ditambahkan_

## 🚀 Quick Start

### Prerequisites
- Android Studio 2022.1 atau lebih baru
- Android API Level 24 (Android 7.0) atau lebih tinggi
- Kotlin 1.9.x atau lebih baru

### Clone Repository
```bash
git clone https://github.com/wangsawidjaya/kasir-djoeragan.git
cd kasir-djoeragan
```

### Build & Run
1. Buka project di Android Studio
2. Sync Gradle
3. Run di emulator atau device

## 📁 Struktur Project

```
kasir-djoeragan/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/djoeragan/kasir/
│   │   │   │   ├── data/          # Data layer (DB, API)
│   │   │   │   ├── domain/        # Domain layer (Entities, UseCases)
│   │   │   │   ├── presentation/  # UI layer (Screens, ViewModels)
│   │   │   │   ├── di/            # Dependency Injection
│   │   │   │   └── MainActivity.kt
│   │   │   └── res/
│   │   └── test/
│   └── build.gradle.kts
├── build.gradle.kts
└── settings.gradle.kts
```

## 📖 Dokumentasi

- [Setup Project](docs/SETUP.md)
- [Fitur](docs/FEATURES.md)
- [Contoh Penggunaan](docs/USAGE.md)
- [Kontribusi](docs/CONTRIBUTING.md)

## 🤝 Kontribusi

Kami menerima kontribusi! Silakan buat pull request atau buka issue untuk saran dan perbaikan.

## 📄 Lisensi

Project ini berlisensi MIT - lihat file [LICENSE](LICENSE) untuk detail.

## 👨‍💻 Author

**Kasir Djoeragan** - Dibuat dengan ❤️ untuk UMKM Indonesia

---

**Hubungi Kami:**
- Issues: [GitHub Issues](https://github.com/wangsawidjaya/kasir-djoeragan/issues)
- Discussions: [GitHub Discussions](https://github.com/wangsawidjaya/kasir-djoeragan/discussions)

**Happy Coding! 🚀**
