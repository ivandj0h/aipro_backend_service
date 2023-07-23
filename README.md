# AIPro Backend Service

## Descriptions
`AIPro Backend Service` is a backend service for CRUD Operation for Project AIMGT

## Features
- [x] REST API
- [x] Route Protection
- [x] JWT Authentication

# This Documentations is Under Construction!

## How to Generate Pem
```bash
openssl genrsa -out keypair.pem 2048
```

## How to Generate Public Key
```bash
openssl rsa -in keypair.pem -pubout -out public.pem
```

## How to Generate Private Key
```bash
openssl pkcs8 -topk8 -inform PEM -outform PEM -in keypair.pem -out private.pem -nocrypt
```
