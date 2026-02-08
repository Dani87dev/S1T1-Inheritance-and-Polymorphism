# 🧬 INHERITANCE AND POLYMORPHISM

This unit explores **Inheritance** and **Polymorphism** to achieve code reusability and dynamic behavior.  
The focus is on building class hierarchies, understanding `static` and `final` modifiers, and implementing interfaces for multiple behaviors.



## 📌 Exercise 1 · Level 1 — Musical Instruments (Polymorphism)

- Create an abstract class `Instrument` and three subclasses:
  - `WindInstrument`
  - `StringInstrument`
  - `PercussionInstrument`
- Implement a polymorphic `play()` method with a specific message for each type.
- **Class Loading**: prove that classes load only once using a static block triggered by the first instance or a static member access.


## 📌 Exercise 2 · Level 1 — Car Class (Static & Final)

- Create a `Car` class to differentiate between memory and initialization modifiers.
- **Attributes**:
  - `static final` → `brand`
  - `static` → `model`
  - `final` → `power`
- **Methods**:
  - Static method `brake()`
  - Non-static method `accelerate()`

### Questions & Answers

➤ **Which of these attributes can be initialized from the constructor?** <br>
    - Only `POWER` can be initialized from the constructor because it is a non-static final attribute. Each `Car` instance sets its own value when it is created.

➤ **Which attribute can never be modified?**<br>
    - `BRAND` can never be modified because it is declared as `static final`. Its value is fixed at declaration time and shared by the whole class.

➤ **Which attribute affects all instances of the class?**  <br>
    - `model` affects all instances because it is static. Any change to `model` is shared across every `Car` object.


## 📌 Exercise 1 · Level 2 — Smartphone (Interfaces)

- Combine inheritance and interfaces to model complex objects.
- **Base class**: `Phone` (calling functionality).
- **Interfaces**:
  - `Camera`
  - `Clock`
- **Subclass**: `Smartphone`, extending the base class and implementing both interfaces.

---

## 🛠 Technologies

- Java 21 (LTS)
- IntelliJ IDEA
- GitHub

---

## 🚀 How to Clone and Run the Project Locally

```bash
git clone https://github.com/Dani87dev/Sprint-1.git
