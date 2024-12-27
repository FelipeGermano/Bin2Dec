# Conversor Binário para Decimal

Este programa em Java converte números binários para seus equivalentes decimais (base-10). Os usuários podem inserir sequências binárias de até 8 dígitos, e o programa garante a validação da entrada enquanto calcula e exibe o resultado. Ele também permite múltiplas conversões em uma única execução.

## Funcionalidades
- Aceita sequências binárias de até 8 dígitos.
- Valida a entrada para garantir que apenas dígitos binários (0 e 1) sejam inseridos.
- Usa funções matemáticas para calcular o equivalente decimal.
- Permite que os usuários realizem várias conversões em uma única sessão.
- Notifica os usuários sobre entradas inválidas com mensagens de erro apropriadas.

## Como Usar

### Pré-requisitos
- Kit de Desenvolvimento Java (JDK) instalado.
- Um terminal ou um Ambiente de Desenvolvimento Integrado (IDE) como IntelliJ IDEA, Eclipse ou Visual Studio Code.

### Passos
1. **Compile o Programa:**
   Abra um terminal ou IDE e compile o programa usando o seguinte comando:
   ```
   javac BinaryToDecimalConverter.java
   ```

2. **Execute o Programa:**
   Execute o programa compilado com:
   ```
   java BinaryToDecimalConverter
   ```

3. **Forneça a Entrada:**
   - Insira uma sequência binária (com até 8 dígitos).
   - Exemplo: `1011`
   - Se a entrada for válida, o programa exibirá o equivalente decimal.

4. **Continue ou Saia:**
   - Após cada conversão, o programa perguntará se você deseja continuar.
   - Digite `s` para converter outro número binário ou `n` para sair.

### Exemplo de Saída
#### Entrada Válida
```
Digite uma sequência de até 8 dígitos binários (apenas 0 e 1): 1011
O equivalente decimal é: 11
Deseja converter outro número? (s/n): n
Encerrando o programa. Até mais!
```

#### Entrada Inválida
```
Digite uma sequência de até 8 dígitos binários (apenas 0 e 1): 10201
Entrada inválida. Certifique-se de inserir apenas dígitos binários (0 ou 1) e no máximo 8 dígitos.
```

## Destaques do Código
- **Validação da Entrada:** Garante que a entrada contenha apenas `0` e `1` e tenha no máximo 8 caracteres.
- **Lógica de Conversão:** Usa a fórmula `Math.pow(2, posição)` para calcular o equivalente decimal.
- **Mensagens Amigáveis:** Guia o usuário durante o processo e fornece feedback de erro quando necessário.