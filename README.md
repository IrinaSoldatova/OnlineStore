# Online Store

### Структура проекта:
- **class Main**

Является основным классом для запуска программы и вызова методов различных классов.

### exceptions:
- **class CustomerException**

Выбрасывается при передаче в метод несуществующего объекта `Customer`
- **class ProductException**

Выбрасывается при передаче в метод несуществующего объекта `Product`
- **class AmountException**

Выбрасывается при передаче в метод некорректного значения `Amount`
### enums:
- **enum Holidays** 

Содержит информацию о праздниках:

`NEW_YEAR` `MARCH_8` `FEB_23`

А так же метод `congratulateEmployees`, который принимает массив сотрудников
и выдает поздравление, если сегодня соответствующий день.
- **enum Genders** 

Содержит значения мужского и женского пола:

`MALE` `FEMALE`
### models:
- **class Customer**

Абстрактный класс, содержит информацию о покупателе:

`lastName` `firstName` `middleName` `dateOfBirth` `phoneNumber` `gender`

А так же метод `getAge()` для вычисления возраста по дате рождения на основании текущей даты.
- **class Employee**

Наследуемый класс от `Customer`, содержит дополнительную информацию о сотрудниках:

`position` `salary`
- **class Order**

Содержит информацию о заказе:

`customer` `product` `amount`
- **class Product**

Содержит информацию о товаре:

`name` `price`
### services:
- **Shopping**

Содержит статический метод `buy`, который выполняет:

- Проверку наличия покупателя и товара
- Проверку количества товара
- Генерирует исключения
- Создание объекта `Order`
- Возвращение объекта `Order`
### utils:
- **CreatingArrays**

Содержит методы создания массивов:

`customers` `products` `employees`