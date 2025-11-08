<script>
$(document).ready(function() {
    // 1. Função para adicionar um novo campo de Formação Acadêmica
    $("#adicionar-formacao").click(function() {
        // HTML do novo bloco de formação
        const novoCampoFormacao = `
            <div class="formacao-item dynamic-item">
                <button type="button" class="remover-item">Remover</button>
                <label>Curso:</label>
                <input type="text" name="formacao_curso[]" required>
                <label>Instituição:</label>
                <input type="text" name="formacao_instituicao[]" required>
                <label>Ano Conclusão:</label>
                <input type="number" name="formacao_ano[]" placeholder="AAAA" required maxlength="4">
            </div>
        `;
        $("#formacao-container").append(novoCampoFormacao);
    });

    // 2. Função para adicionar um novo campo de Experiência Profissional
    $("#adicionar-experiencia").click(function() {
        // HTML do novo bloco de experiência
        const novoCampoExperiencia = `
            <div class="experiencia-item dynamic-item">
                <button type="button" class="remover-item">Remover</button>
                <div class="field-group">
                    <label>Nome da Empresa:</label>
                    <input type="text" name="exp_empresa[]" required>
                    <label>Cargo/Função:</label>
                    <input type="text" name="exp_cargo[]" required>
                </div>

                <div class="field-group">
                    <label>Data de Início:</label>
                    <input type="month" name="exp_inicio[]" required>
                    <label>Data de Saída:</label>
                    <input type="month" name="exp_saida[]">
                    <div class="current-job-checkbox">
                        <input type="checkbox" name="exp_atual[]" value="1">
                        <label>Emprego Atual</label>
                    </div>
                </div>
                
                <label>Descrição das Atividades/Resultados:</label>
                <textarea name="exp_descricao[]" rows="4"></textarea>
            </div>
        `;
        $("#experiencia-container").append(novoCampoExperiencia);
    });

    // 3. Função para remover um item dinâmico (Formação ou Experiência)
    // Usa um 'event delegate' para funcionar em elementos adicionados dinamicamente
    $(document).on('click', '.remover-item', function() {
        $(this).closest('.dynamic-item').remove();
    });

    // 4. Estilo para o botão de remover (opcional, pode ir no CSS principal)
    // Para simplificar, adicione esta regra ao seu 'style.css':
    /*
    .remover-item {
        float: right;
        background-color: #dc3545;
        color: white;
        border: none;
        padding: 5px 10px;
        border-radius: 4px;
        cursor: pointer;
        font-size: 0.9em;
    }
    .remover-item:hover {
        background-color: #c82333;
    }
    */
});


</script>

</div>

