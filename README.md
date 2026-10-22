## Projektleírás (eddig elkészült részek)

A projekt jelenlegi állapotában elkészült az alkalmazás alapvető szerkezete és infrastruktúrája:

### Projektfüggőségek hozzáadása
Minden szükséges Spring Boot, adatkezelési és validációs dependency beállítva a projekt működéséhez.

### Alkalmazás konfigurációja
Az `application.properties` / `application.yml` fájlokban megtörtént az alapvető konfiguráció (adatbázis, e‑mail, biztonsági beállítások stb.).

### Enumok létrehozása
A rendszer működéséhez szükséges enum típusok definiálva és integrálva az entitásokba és DTO‑kba.

### Entitások felépítése
Az összes adatbázis‑entitás elkészült, a kapcsolatokkal és annotációkkal együtt (`@Entity`, `@OneToMany`, `@ManyToOne`, validációk stb.).

### Globális kivételkezelés
Létrehozott egyedi kivételosztályok és egy teljes, egységes hibakezelést biztosító `@RestControllerAdvice` alapú globális exception handler.
