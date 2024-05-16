<h1 align="center" style="font-weight: bold;">Send Email 💻</h1>

<p align="center">
    <a href="#tech">Technologies</a> • 
    <a href="#started">Getting Started</a> • 
    <a href="#routes">API Endpoints</a> •
    <a href="#about">About</a> •
</p>

<p align="center">
    <b>Sending emails for testing using the MailTrap tool.</b>
</p>

<h2 id="tech">💻 Technologies</h2>

#### List of all technologies and tools
- Java
- SpringBoot
- MailTrap

<h2 id="started">🚀 Getting started</h2>

<h3>Cloning</h3>

Clone the repository:

```bash
git clone https://github.com/thomasgsquinaia/https://github.com/thomasgsquinaia/send-email-api
```

<h3>Config application.properties variables</h2>

Use the `application.properties` as reference to create your configuration file

```yaml
spring.mail.host=sandbox.smtp.mailtrap.io
spring.mail.port=465
spring.mail.username=
spring.mail.password=
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
```

<h2 id="routes">📍 API Endpoints</h2>

| route               | description                                          
|----------------------|-----------------------------------------------------
| <kbd>POST /email</kbd>     | send email for MailTrap Tool


<h2 id="about">📫 About</h2>

Linkedin: https://www.linkedin.com/in/thomas-quinaia-82b5221b1/