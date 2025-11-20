# 💱 Currency Converter Android

<div align="center">

![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![Kotlin](https://img.shields.io/badge/Kotlin-0095D5?&style=for-the-badge&logo=kotlin&logoColor=white)
![Jetpack Compose](https://img.shields.io/badge/Jetpack_Compose-4285F4?style=for-the-badge&logo=jetpack-compose&logoColor=white)

Um aplicativo moderno de conversão de moedas para Android, desenvolvido com as melhores práticas e arquitetura MVVM.

</div>

## 📱 Screenshots

<div align="center">
  <img src="screenshots/conversion-screen.png" width="200" alt="Tela de Conversão">
  <img src="screenshots/history-screen.png" width="200" alt="Tela de Histórico">
  <img src="screenshots/dark-mode.png" width="200" alt="Modo Escuro">
</div>

## ✨ Funcionalidades

- **💰 Conversão em Tempo Real** - Suporte a múltiplas moedas
- **📊 Histórico de Conversões** - Persistência local com Room
- **🌙 Modo Escuro** - Suporte completo a temas
- **⚡ Arquitetura Moderna** - MVVM com Clean Architecture
- **🔍 Filtros Inteligentes** - Busque no histórico por moeda
- **📱 UI Responsiva** - Design moderno com Jetpack Compose

## 🛠 Tecnologias Utilizadas

### **Arquitetura & Padrões**
- 🏗 **MVVM Architecture** - Separação clara de responsabilidades
- 🧩 **Clean Architecture** - Camadas bem definidas
- 🔄 **StateFlow** - Gerenciamento de estado reativo
- 🎯 **One-Shot Events** - Eventos únicos com Channel/SharedFlow

### **Android Jetpack**
- 🎨 **Jetpack Compose** - UI declarativa moderna
- 🗺 **Navigation Component** - Navegação entre telas
- 🗃 **Room Database** - Persistência local
- 🏛 **ViewModel** - Gerenciamento de dados da UI
- 🧩 **Hilt** - Injeção de dependência

### **Networking & Assíncrono**
- 🌐 **Retrofit** - Cliente HTTP para APIs REST
- ⚡ **Coroutines** - Programação assíncrona
- 🚀 **Suspend Functions** - Operações não-bloqueantes

### **Outras Bibliotecas**
- 📊 **Gson** - Serialização JSON
- 🔍 **OkHttp Logging Interceptor** - Debug de requisições

## 🏗 Estrutura do Projeto
app/
├── data/
│ ├── local/ # Room Database
│ │ ├── entity/ # Entidades do banco
│ │ ├── dao/ # Data Access Objects
│ │ └── CurrencyDatabase.kt
│ ├── remote/ # API Remote
│ │ ├── api/ # Interface Retrofit
│ │ └── RetrofitClient.kt
│ ├── repository/ # Repositórios unificados
│ └── models/ # Modelos de dados
├── di/ # Injeção de dependência (Hilt)
├── ui/
│ ├── screens/ # Telas Composable
│ ├── viewmodel/ # ViewModels
│ ├── state/ # Estados da UI
│ ├── events/ # Eventos one-shot
│ └── components/ # Componentes reutilizáveis
├── navigation/ # Navegação
└── utils/ # Utilitários e extensões
