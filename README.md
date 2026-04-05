# 📱 LAB 4 - Manipulation Dynamique des Fragments

## 🎯 Objectif général
Ce laboratoire a pour objectif de comprendre et maîtriser l’utilisation des **fragments dynamiques** dans Android.

À travers ce projet, vous allez apprendre à :
- Créer et utiliser des **fragments dynamiques** dans une activité.
- Naviguer entre plusieurs fragments avec **FragmentManager**.
- Gérer les événements et états dans les fragments (clics, SeekBar, etc.).
- Comprendre le **cycle de vie d’un fragment**.

---

## 🧠 Concepts clés

### 🔹 Fragments
Les fragments sont des composants modulaires représentant une partie de l’interface utilisateur dans une activité.  
Ils permettent de construire des interfaces flexibles et réutilisables.

### 🔹 FragmentManager
Le **FragmentManager** permet de gérer les fragments dans une activité :
- Ajouter un fragment
- Remplacer un fragment
- Supprimer un fragment
- Gérer la pile de navigation (Back Stack)

### 🔹 FragmentTransaction
Une **FragmentTransaction** est utilisée pour appliquer des modifications :

```java
getSupportFragmentManager()
    .beginTransaction()
    .replace(R.id.container, new MonFragment())
    .commit();
