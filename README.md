# Java_Core_Lesson_19
<b>Потоки I/0 та серіалізація</b>

 [Завдання](https://github.com/ValeriiJavalesson/Java_Core_Lesson_19/tree/master/src)
 
* Створити клас Employee, описати даний клас наступними полями: name, id, salary. Дані поля повинні бути private. Описати getters and setters.
* Створити клас Methods де описати всього два методи serialize() and deserealize(). В даних методах повинно бути бути використано FileInputStream/FileOutputStream , ObjectInputStream/ObjectOutputStream. 
* Створити метод Main створити екземпляр класу Employee і провести сереалізацію та десереалізацію. Результат Десереалізації вивести на консоль. Помітити поле salary модифікатором transient і провести серіалізацію і десеріалізацію. Результат вивести на екран. 
* Створити колекцію об’єктів Employee, провести серіалізацію та десеріалізацю колекції
