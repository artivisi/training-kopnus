# Pemakaian Git Sehari-hari #

## Manajemen Repository ##

* Membuat repository lokal : `git init namafolder`
* Clone repository remote : `git clone url-remote`

## Mengelola File ##

* Melihat kondisi working folder : `git status`
* Melihat perubahan : `git diff`
* Menyiapkan perubahan yang akan disimpan : `git add namafile` atau `git add .` (untuk semua file rekursif)
* Menyimpan perubahan : `git commit -m "keterangan perubahan"`
* Melihat riwayat perubahan : `git log`, `git log --oneline`

## Bekerja dengan Remote Repository ##

* Mendaftarkan remote repo : `git remote add nama-alias-repo url-repo`
* Melihat remote repo yang sudah didaftarkan : `git remote -v`
* Mengupload isi repo lokal ke remote : `git push nama-remote nama-branch`
* Mengunduh perubahan dari remote : `git pull`
* Mengganti URL remote repo : `git remote set-url nama-remote url-repo`
