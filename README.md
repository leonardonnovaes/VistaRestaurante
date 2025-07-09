# 🍽️ Sistema de Comandas Regionais em Java (GUI com Swing)

Este projeto em Java é uma aplicação simples com interface gráfica (JOptionPane) para simular a abertura e gestão de comandas em um restaurante com pratos típicos de diferentes regiões do Brasil.

---

## 📋 Funcionalidades

- Interface gráfica com menus interativos usando `JOptionPane`.
- Permite abrir uma nova comanda.
- Permite escolher comidas típicas das 5 regiões do Brasil (Norte, Nordeste, Sul, Sudeste e Centro-Oeste).
- Permite adicionar bebidas à comanda.
- Simula o controle de mesas com armazenamento em uma lista (`ArrayList`).
- Calcula automaticamente os valores dos pratos e bebidas (embora o total ainda não seja exibido no final, o sistema está pronto para expansão).

---

## 🍲 Regiões e Pratos Disponíveis

| Região        | Pratos Típicos                                   | Preço (R$) |
|---------------|--------------------------------------------------|------------|
| Norte         | Tacacá, Açaí, Pirarucu                           | 20.00      |
| Nordeste      | Acarajé, Baião de Dois, Cuscuz                   | 30.00      |
| Sul           | Churrasco Gaúcho, Barreado, Pinhão              | 40.00      |
| Sudeste       | Feijoada, Moqueca, Virado à Paulista            | 50.00      |
| Centro-Oeste  | Pequi, Pamonha, Mojica                           | 60.00      |
| Bebidas       | Água, Coca-Cola, Cerveja                         | 5.00       |

---

## 🛠️ Como Executar

1. **Pré-requisitos**:
   - Java JDK 8 ou superior instalado.

2. **Compilação**:
   ```bash
   javac Main.java
