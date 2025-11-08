Gerador de Currículo Profissional (PHP, Dompdf, Bootstrap)

Este sistema foi criado para produzir currículos profissionais em PDF de forma completa. A interface para preenchimento é atual e responsiva, construída com HTML e Bootstrap 5, enquanto a lógica que processa e converte para PDF é feita utilizando PHP e a biblioteca Dompdf. O projeto cumpre com as exigências para o desenvolvimento de uma experiência de usuário (UI/UX) moderna, aplicando o framework Bootstrap e controlando versões através do Git.

Requisitos e Funcionalidades Implementadas:

Geração de PDF: Transformação do formulário preenchido em um arquivo PDF final.
Controle de Versão (Git): Registro detalhado de commits para monitorar todas as modificações.
Design Responsivo: Implementação do Bootstrap 5 para assegurar que o formulário seja atraente e funcional em diversos tamanhos de tela, atendendo assim as exigências do framework UI.
Estrutura Dinâmica: Seções de Experiência Profissional que podem ser adicionadas ou retiradas de forma dinâmica utilizando JavaScript.
Usabilidade: Resolução de falhas na exibição de texto em navegadores que utilizam o Modo Escuro solicitado.
Limpeza de Dados: Eliminação total da parte de Referências Pessoais, tornando o currículo mais conciso.
Órgão Utilizado:

PHP: Lógica de backend, gestão dos dados do formulário e transformação para HTML.
Dompdf: Biblioteca PHP empregada para processar o HTML/CSS gerado e salvá-lo como documento PDF.
Bootstrap 5 Framework CSS: para o design responsivo do formulário de entrada.
HTML5 e CSS3: Estrutura fundamental do formulário e estilos personalizados.
JavaScript/jQuery Gestão do DOM (adição/remoção de campos de experiência) e solicitação de assinatura (fetch) para baixar o PDF.
Para executar este projeto, é necessário um servidor local compatível com PHP (como XAMPP, WAMP, MAMP ou PHP CLI). Requisitos prévios:

Um servidor web local (exemplo: XAMPP).
PHP versão 7.4 ou superior.
Composer instalado (para administrar as dependências do PHP).
Git (para clonar o repositório).
Instruções de Instalação:

1 - Clone o repositório (ou faça o download dos arquivos). No terminal, utilize os seguintes comandos: git clone [LINK DO SEU REPOSITÓRIO NO GITHUB] cd gerador-curriculo

2 - Instale o Dompdf (Este projeto utiliza o Composer para a instalação da biblioteca Dompdf. Assegure-se de que o Composer esteja na pasta principal do projeto e execute no terminal). instalação do Composer

3 - Hospede em seu servidor local: Transfira a pasta do projeto para o diretório de documentos de seu servidor local (por exemplo, a pasta "htdocs" no XAMPP).

4 - Abra seu navegador e acesse o caminho do projeto (Ex: file:///C:/Users/User/Desktop/curriculo/Untitled-1.html)

Contribuição e Autor: João Vitor Belini de Souza

Licença: Para Fins Acadêmicos
