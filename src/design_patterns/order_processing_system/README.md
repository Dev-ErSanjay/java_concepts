# 🛒 Order Processing System - Java Design Patterns Project

## 📌 Project Overview

Order Processing System is a Core Java based backend simulation project designed to understand and implement real-world **Object Oriented Design Principles** and **Gang of Four (GoF) Design Patterns**.

The project demonstrates how enterprise applications are designed internally by applying reusable design solutions like Factory, Strategy, Observer, Proxy, Adapter, Facade, Builder, Singleton, and Chain of Responsibility.

The goal of this project is not to build APIs or databases but to deeply understand how frameworks like Spring Boot internally use these patterns.

---

# 🎯 Project Objectives

✔ Understand practical implementation of Design Patterns  
✔ Build loosely coupled and maintainable Java applications  
✔ Improve Object-Oriented Programming skills  
✔ Learn SOLID principles through real scenarios  
✔ Understand Spring Boot internal architecture concepts  
✔ Prepare for Java Backend Developer interviews


---

# 🏗️ Application Architecture


## High Level Flow


                    USER

                      |
                      |
                      v

              Checkout Facade

                      |
                      |

      --------------------------------

      |              |               |

 Validation      Discount          Payment

 Chain           Strategy          Factory

      |              |               |

      |              |               |

 Auth Check    Premium Rule     Payment Type

 Stock Check   Normal Rule      UPI/Card/Wallet

      |
      |
      v

 Order Creation

      |
      |

 Event Publisher (Observer)

      |

 ------------------------------

 |                            |

Email Notification       SMS Notification



---

# 🧱 Complete Package Structure


src/main/java

└── com.order.system

    │
    ├── Main.java
    │

    ├── model
    │      │
    │      ├── User.java
    │      ├── Product.java
    │      └── Order.java
    │

    ├── config
    │      │
    │      ├── Logger.java
    │      └── AppConfig.java
    │

    ├── payment
    │      │
    │      ├── Payment.java
    │      ├── UpiPayment.java
    │      ├── CardPayment.java
    │      ├── WalletPayment.java
    │      └── PaymentFactory.java
    │

    ├── discount
    │      │
    │      ├── DiscountStrategy.java
    │      ├── NormalDiscount.java
    │      └── PremiumDiscount.java
    │

    ├── validation
    │      │
    │      ├── OrderValidator.java
    │      ├── AuthValidator.java
    │      ├── StockValidator.java
    │      └── PaymentValidator.java
    │

    ├── notification
    │      │
    │      ├── OrderObserver.java
    │      ├── EmailService.java
    │      ├── SmsService.java
    │      └── NotificationManager.java
    │

    ├── external
    │      │
    │      ├── RazorpayAPI.java
    │      └── RazorpayAdapter.java
    │

    ├── proxy
    │      │
    │      └── PaymentProxy.java
    │

    └── checkout

           |
           └── CheckoutFacade.java



---

# 🚀 Implementation Roadmap


# Phase 0 - Project Foundation


## Goal

Create base project structure and domain models.


## Implementation


Create:

- User Model
- Product Model
- Order Model
- Main Application


Concepts:

- Classes
- Objects
- Encapsulation
- Composition


Output:


User creates an order successfully


---

# Phase 1 - Singleton Design Pattern


## Goal

Create objects which should have only one instance.


## Implement


Classes:

- Logger
- AppConfig


Architecture:


Application

     |

Logger.getInstance()

     |

Same Logger Object



Concepts Learned:

- Private Constructor
- Static Instance
- Global Access Point


Real Usage:

- Spring Singleton Beans
- Database Connection Pool
- Logging Frameworks


---

# Phase 2 - Builder Design Pattern


## Goal

Create complex objects cleanly.


## Implement


Order Builder


Before:


Order(1,"Phone",50000,"PAID","Address")


After:


Order.builder()
.id(1)
.amount(50000)
.status("CREATED")
.build()



Concepts Learned:

- Immutable Objects
- Clean Object Creation


Real Usage:

- Lombok Builder
- StringBuilder


---

# Phase 3 - Factory Design Pattern


## Goal

Remove object creation responsibility from client.


## Implement Payment Module



Payment Interface

        |

-------------------

|        |        |

UPI     CARD    WALLET



Factory:


PaymentFactory


Example:


Payment payment =
PaymentFactory.create("UPI");



Concepts Learned:

- Loose Coupling
- Runtime Object Creation


Real Usage:

Spring Bean Factory


---

# Phase 4 - Strategy Design Pattern


## Goal

Change business logic dynamically.


## Implement Discount Engine



DiscountStrategy

          |

---------------------

|                   |

Normal           Premium



Runtime:


Customer Type

      |

Select Discount Logic



Concepts Learned:

- Open Closed Principle
- Runtime Behaviour Change


Real Usage:

Payment Systems

Pricing Engines


---

# Phase 5 - Chain Of Responsibility Pattern


## Goal

Create validation pipeline.


## Implement Order Validation Chain



Request

  |

Auth Validator

  |

Stock Validator

  |

Payment Validator

  |

Order Success



Concepts Learned:

- Handler Chain
- Responsibility Separation


Real Usage:

Spring Security Filters


---

# Phase 6 - Observer Design Pattern


## Goal

Event driven communication.


## Implement Notification System



Order Created Event


        |

--------------------

|                  |

Email            SMS



Concepts Learned:

- Publisher Subscriber Model
- Event Driven Architecture


Real Usage:

Kafka

Spring Events


---

# Phase 7 - Adapter Design Pattern


## Goal

Connect incompatible systems.


## Implement


External Gateway:


RazorpayAPI


Adapter:


RazorpayAdapter



Flow:


Application

     |

Payment Adapter

     |

External API



Concepts Learned:

- System Integration


Real Usage:

Third Party APIs


---

# Phase 8 - Proxy Design Pattern


## Goal

Control access before actual execution.


## Implement


PaymentProxy


Responsibilities:

- Logging
- Security Check
- Validation


Flow:


Client

  |

Proxy

  |

Real Payment



Real Usage:

- Spring AOP
- Transaction Management


---

# Phase 9 - Facade Design Pattern


## Goal

Hide system complexity.


## Implement


CheckoutFacade


Handles:

- Validation
- Discount
- Payment
- Notification


Client only calls:


checkout.placeOrder(order);



Concepts Learned:

- Simplified API Layer


Real Usage:

Service Layer Architecture


---

# Final Execution Flow


Main.java


        |

        v


CheckoutFacade


        |

        |

Validation Chain

        |

Discount Strategy

        |

Payment Factory

        |

Payment Proxy

        |

Payment Adapter

        |

Order Event

        |

Observer Notifications



---

# Design Patterns Covered


| Pattern | Implementation |
|------|---------------|
| Singleton | Logger |
| Builder | Order Creation |
| Factory | Payment Creation |
| Strategy | Discount Logic |
| Chain Responsibility | Order Validation |
| Observer | Notifications |
| Adapter | Payment Gateway |
| Proxy | Secure Payment |
| Facade | Checkout Process |


---

# Future Enhancement


Spring Boot Migration:

Core Java
   |
   v
Spring Boot


Mapping:


Singleton
    → Spring Beans


Factory
    → Dependency Injection


Observer
    → Kafka


Proxy
    → Spring AOP


Chain
    → Security Filters


Facade
    → Service Layer


Adapter
    → External REST Clients


---

# Technology Stack


Language:
Java 17


Build:
Maven


Concepts:
OOP
SOLID Principles
Design Patterns


---

# Author

Java Backend Design Patterns Learning Project
