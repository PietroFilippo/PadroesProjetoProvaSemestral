# PadroesProjetoProvaSemestral

Implementação de cinco questões utilizando padrões de projeto clássicos do GoF (Gang of Four) em Java, com foco em princípios SOLID e boas práticas de design.

## Questões Implementadas

### Questão 1 - Padrão Factory Method

**Problema**: Sistema de geração de relatórios com diferentes tipos (diário e semanal) que compartilham o mesmo processo de criação.

**Padrão Escolhido**: Factory Method

**Justificativa**:
- Encapsula a lógica de criação de objetos específicos (relatórios)
- Permite adicionar novos tipos de relatórios sem modificar código existente (Open/Closed Principle)
- Delegua a responsabilidade de instanciação às subclasses
- Centraliza o processo de criação (coleta de dados, formatação, geração de arquivo)

**Componentes Principais**:
- `Report`: Interface para relatórios
- `RelatorioDiario`, `RelatorioSemanal`: Implementações concretas de relatórios
- `ReportCreator`: Classe abstrata com Factory Method
- `ReportCreatorDiario`, `ReportCreatorSemanal`: Criadores concretos que instanciam seus respectivos relatórios

**Processo de Criação**:
1. Coleta de dados (ordens processadas, entregas, falhas)
2. Formatação do relatório em PDF
3. Geração do arquivo final

---

### Questão 2 - Padrão Strategy

**Problema**: Sistema de análise de risco financeiro com múltiplos algoritmos intercambiáveis (conservador, moderado e agressivo).

**Padrão Escolhido**: Strategy

**Justificativa**:
- Encapsula diferentes algoritmos de análise de risco
- Permite troca dinâmica de algoritmos em tempo de execução
- Elimina condicionais complexos para seleção de algoritmos
- Facilita adição de novos modelos de análise sem modificar código existente

**Componentes Principais**:
- `CalculadoraRisco`: Interface para estratégias de cálculo
- `ModeloConservador`, `ModeloModerado`, `ModeloAgressivo`: Implementações concretas de estratégias
- `AnaliseContexto`: Contexto que utiliza as estratégias

**Fórmulas de Cálculo**:
- **Conservador**: `(renda * 0.1) + (bens * 0.1) - (dívidas * 0.3) + 7.5`
- **Moderado**: `(renda * 0.15) + (bens * 0.3) - (dívidas * 0.2) + 15`
- **Agressivo**: `(renda * 0.2) + (bens * 0.5) - (dívidas * 0.1) + 30`

---

### Questão 3 - Padrão Observer

**Problema**: Sistema de monitoramento ambiental com sensores que notificam múltiplos observadores sobre mudanças de estado.

**Padrão Escolhido**: Observer

**Justificativa**:
- Desacopla objetos observados de seus observadores
- Permite notificação automática de múltiplos componentes sobre mudanças
- Facilita adição/remoção de observadores sem modificar o sujeito
- Suporta comunicação um-para-muitos entre objetos

**Componentes Principais**:
- `Sensor`: Interface para o sujeito observado
- `SensorConcreto`: Implementação concreta do sensor (temperatura, umidade, índice de poluição)
- `SensorObservador`: Interface para observadores
- `PainelControle`: Exibe dados atualizados do sensor
- `ModuloAlertas`: Emite alertas quando valores excedem limites (temperatura > 35°C, poluição > 80)
- `RegistroHistorico`: Registra leituras no banco de dados

**Funcionalidades**:
- Notificação automática de todos os observadores quando o sensor atualiza medições
- Registro e remoção dinâmica de observadores
- Cada obsrvador processa as atualizações de acordo com sua responsabilidade específica

---

### Questão 4 - Padrão Chain of Responsibility

**Problema**: Sistema de validação de transações financeiras com múltiplas verificações de fraude em cadeia.

**Padrão Escolhido**: Chain of Responsibility

**Justificativa**:
- Desacopla remetentes de destinatários de requisições
- Permite múltiplos validadores processarem em sequência
- Facilita adicionar/remover validadores sem modificar código existente
- Cada validador decide se processa e/ou passa adiante

**Componentes Principais**:
- `FraudeCheck`: Classe abstrata base da cadeia (Handler)
- `ProcessadorTransacao`: Processador que executa a cadeia de validação
- `Transacao`: Entidade de transação (valor, localização, score de risco do usuário, dispositivo)

**Validadores Implementados**:
1. `ValorSuspeito` - Valida se o valor da transação não excede R$ 5.000,00
2. `Geolocalizacao` - Verifica se a localização é válida (ex: "BR")
3. `Historico` - Valida score de risco do usuário (deve ser ≤ 70)
4. `DispositivoIncomum` - Verifica se o dispositivo não é desconhecido ("UNKNOWN")

**Fluxo de Execução**:
- Cada validador executa sua verificação
- Se a validação falhar, uma exceção é lançada interrompendo a cadeia
- Se a validação passar, o próximo validador na cadeia é executado
- Transação é aprovada apenas se todos os validadores passarem

---

### Questão 5 - Padrão Singleton

**Problema**: Sistema de logging centralizado que garante uma única instância para toda a aplicação, mesmo em ambiente multi-thread.

**Padrão Escolhido**: Singleton

**Justificativa**:
- Garante uma única instância do logger em toda a aplicação
- Controla acesso global ao recurso de logging
- Evita múltiplas instâncias que poderiam causar problemas de concorrência
- Centraliza a configuração e gerenciamento de logs

**Componentes Principais**:
- `LoggerSingleton`: Classe singleton com escrita em arquivo

**Funcionalidades**:
- **Thread-Safe**: Implementação com double-checked locking para garantir segurança em ambientes multi-thread
- **Persistência**: Registra logs em arquivo `logs.txt` com timestamp
- **Integração Externa**: Envia logs para servidor de monitoramento (simulado)
- **Sincronização**: Métodos sincronizados para evitar condições de corrida durante escrita

**Características de Implementação**:
- Construtor privado para evitar instanciação externa
- Método `getInstance()` estático que retorna a única instância
- Uso de `volatile` para garantir visibilidade entre threads
- Flush automático após cada escrita para garantir persistência imediata
