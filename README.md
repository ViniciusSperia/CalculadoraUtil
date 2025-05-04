📐 Calculadora Utilitária em Java (Console)

Este projeto implementa uma calculadora simples no terminal, desenvolvida em Java, que oferece operações matemáticas básicas e a exibição da tabuada de um número específico. O programa é executado inteiramente via console, utilizando entrada do usuário e exibição de resultados por meio de menus interativos.

🔧 Funcionalidades

somar(int a, int b): retorna a soma de dois inteiros.

subtrair(int a, int b): retorna a subtração entre dois inteiros.

multiplicar(int a, int b): retorna a multiplicação entre dois inteiros.

dividir(int a, int b): retorna o resultado da divisão entre dois inteiros, com verificação de divisão por zero.

mostrarTabuada(int numero): imprime a tabuada do número fornecido, de 1 a 10.

Menu de navegação no console com repetição até escolha da opção "Sair".

▶️ Como executar

Certifique-se de ter o Java instalado na máquina.

Compile o programa:

javac Main.java

Execute o programa:

java Main

Ou utilize o botão "Run" em uma IDE como IntelliJ, Eclipse ou VS Code com suporte a Java.

💡 Conceitos aplicados

Durante o desenvolvimento deste projeto, foram praticados e aplicados os seguintes conceitos fundamentais de Java:

Estruturas de repetição com do...while e controle de fluxo com switch

Criação, organização e chamada de métodos com e sem parâmetros

Entrada de dados com Scanner e manipulação de tipos primitivos

Validação de entrada (divisão por zero)

Separação de responsabilidades e modularização do código

📁 Estrutura do código

Main.java

├── main()                  → Loop principal e menu

├── somar(a, b)             → Soma dois inteiros

├── subtrair(a, b)          → Subtrai dois inteiros

├── multiplicar(a, b)       → Multiplica dois inteiros

├── dividir(a, b)           → Divide dois inteiros com verificação

└── mostrarTabuada(numero)  → Exibe tabuada de 1 a 10

✍️ Autor

Desenvolvido por Vinicius Speria — primeiro projeto modular em Java para portfólio de desenvolvedor.
