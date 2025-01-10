# Hotwax Technical Assignment

This repository contains two branches:

- **`task-1`**: Contains the implementation for the first task.
- **`main`**: Contains the second task where I developed RESTful APIs for managing various resources.

---

## Developed by: **Mihir Jaiswal**

---

## API Documentation

Below are the detailed descriptions of the developed RESTful APIs with screenshots showing Postman test results.

---

### Parties API

#### 1. **Create a Party: POST /parties**
- **Endpoint**: `POST /parties`
- **Description**: Creates a new party in the system.
- ![party](https://github.com/user-attachments/assets/3cc764d0-2112-4a0c-bcfa-4517121a91b6)

#### 2. **Retrieve Party Details: GET /parties/{party_id}**
- **Endpoint**: `GET /parties/{party_id}`
- **Description**: Retrieves the details of a specific party by its ID.
- ![partyget](https://github.com/user-attachments/assets/5ebb6f35-1c9f-4348-abc7-a2e95f9422e7)

#### 3. **Update a Party: PUT /parties/{party_id}**
- **Endpoint**: `PUT /parties/{party_id}`
- **Description**: Updates the details of an existing party.
- ![partyput](https://github.com/user-attachments/assets/08e1ddcd-1207-4ef1-ae5a-420f323a26c9)

#### 4. **Delete a Party: DELETE /parties/{party_id}**
- **Endpoint**: `DELETE /parties/{party_id}`
- **Description**: Deletes a specific party by its ID.
- ![partydelete](https://github.com/user-attachments/assets/f20fbf6d-62ae-4d34-8597-742535852d75)

---

### Manage Contact Mechanisms for a Party

#### 1. **Add Contact Mechanism: POST /parties/{party_id}/contacts**
- **Endpoint**: `POST /parties/{party_id}/contacts`
- **Description**: Adds a contact mechanism for a specific party.
- ![contactPost](https://github.com/user-attachments/assets/a1808475-d659-4c93-ac46-ecfc9dae9d7f)

#### 2. **Retrieve Contact Mechanisms: GET /parties/{party_id}/contacts**
- **Endpoint**: `GET /parties/{party_id}/contacts`
- **Description**: Retrieves the contact mechanisms associated with a specific party.
- ![contactget](https://github.com/user-attachments/assets/020a4576-c47c-4994-846f-e5a18cb46a45)

#### 3. **Update Contact Mechanism: PUT /parties/{party_id}/contacts/{contact_mech_id}**
- **Endpoint**: `PUT /parties/{party_id}/contacts/{contact_mech_id}`
- **Description**: Updates a specific contact mechanism for a party.
- ![contactput](https://github.com/user-attachments/assets/4b06c5ca-1af5-45a3-942c-2218b2a9361b)

#### 4. **Delete Contact Mechanism: DELETE /parties/{party_id}/contacts/{contact_mech_id}**
- **Endpoint**: `DELETE /parties/{party_id}/contacts/{contact_mech_id}`
- **Description**: Deletes a specific contact mechanism for a party.
- ![contactDelete](https://github.com/user-attachments/assets/0591aeaa-5116-4ced-8fa3-29bd93825f25)

---

### Product Data API

#### 1. **Create a Product: POST /products**
- **Endpoint**: `POST /products`
- **Description**: Creates a new product in the system.
- ![products](https://github.com/user-attachments/assets/08f2fbf8-6285-48fc-b234-f359ab49c7c4)

#### 2. **Retrieve Product Details: GET /products/{product_id}**
- **Endpoint**: `GET /products/{product_id}`
- **Description**: Retrieves the details of a specific product by its ID.
- ![productGet](https://github.com/user-attachments/assets/12968658-f525-404a-9a1d-abb64e34aa3b)

#### 3. **Update a Product: PUT /products/{product_id}**
- **Endpoint**: `PUT /products/{product_id}`
- **Description**: Updates the details of an existing product.
- ![productPut](https://github.com/user-attachments/assets/f50654ff-9a4e-44dd-9eda-81c9f3c6a90c)

#### 4. **Delete a Product: DELETE /products/{product_id}**
- **Endpoint**: `DELETE /products/{product_id}`
- **Description**: Deletes a specific product by its ID.
- ![productDelete](https://github.com/user-attachments/assets/6fd7bb62-8cc7-437d-9a4d-8b255865bdbe)

---

### Order Data API

#### 1. **Create an Order: POST /orders**
- **Endpoint**: `POST /orders`
- **Description**: Creates a new order in the system.
- ![orders](https://github.com/user-attachments/assets/5fb02988-c793-4d03-863e-664c27f8ff1a)

#### 2. **Retrieve Order Details: GET /orders/{order_id}**
- **Endpoint**: `GET /orders/{order_id}`
- **Description**: Retrieves the details of a specific order by its ID.
- ![orderGet](https://github.com/user-attachments/assets/1134a153-2fac-4862-9805-7e0ec155f4c5)

#### 3. **Update an Order: PUT /orders/{order_id}**
- **Endpoint**: `PUT /orders/{order_id}`
- **Description**: Updates the details of an existing order.
- ![orderPut](https://github.com/user-attachments/assets/ce8722c3-2011-4f8b-8a0b-6c2026229182)

#### 4. **Delete an Order: DELETE /orders/{order_id}**
- **Endpoint**: `DELETE /orders/{order_id}`
- **Description**: Deletes a specific order by its ID.
- ![orderDelete](https://github.com/user-attachments/assets/246ad6c5-fca5-40c2-9ea7-c812d4aa67b7)

#### 5. **Add an Order Item: POST /orders/{order_id}/items**
- **Endpoint**: `POST /orders/{order_id}/items`
- **Description**: Adds an item to an existing order.
- ![addItems](https://github.com/user-attachments/assets/053ef62c-0fcb-41a7-be1a-bd20010e8da6)

---

## Conclusion

This repository includes the full implementation of various RESTful APIs for managing parties, contact mechanisms, products, and orders, tested using Postman for verification. You can use these APIs to create, update, retrieve, and delete records efficiently.
