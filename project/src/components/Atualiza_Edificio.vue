<template>
 <div class="atualizaEdificio">
    <div class="py-5">
    <div class="container">
          <div class="row">
      <!--div class="col-md-1"> </div-->
            <div class="col-md-12">
    <div class="card text-white p-5 bg-primary">
      <div class="card-body" >
        <b-form @submit="onSubmit" @reset="onReset">
        <fieldset><h2>Atualizar Edificação </h2></fieldset>
        <br>
        <br>

        <b-form-group id="exampleInputGroup1"
                        label="Obra:"
                        label-for="exampleInput1">
            <b-form-select id="exampleInput1"
                          :options="obras"
                          required
                          v-model="form.obra">
            </b-form-select>
          </b-form-group>

        
            <b-form-group id="exampleInputGroup2"
                        label="Edificação:"
                        label-for="exampleInput2">
            <b-form-select id="exampleInput2"
                          :options="Edificacao"
                          required
                          v-model="form.edif">
            </b-form-select>
          </b-form-group>

    <b-form-group id="exampleInputGroup3"
                        label="Status:"
                        label-for="exampleInput3">
            <b-form-select id="exampleInput3"
                          :options="Status"
                          required
                          v-model="form.status">
            </b-form-select>
          </b-form-group>

          <b-form-group id="exampleInputGroup4"
                        label="Tipo da Fundação:"
                        label-for="exampleInput4">
            <b-form-input id="exampleInput4"
                          type="text"
                          v-model="form.fundacao"
                          required
                          placeholder="Tipo da Edificação">
            </b-form-input>
          </b-form-group>

          <b-form-group id="exampleInputGroup5"
                        label="Status da Fundação:"
                        label-for="exampleInput5">
            <b-form-select id="exampleInput5"
                          :options="StatusFund"
                          required
                          v-model="form.statusFund">
            </b-form-select>
          </b-form-group>


        <b-form-group id="exampleInputGroup6"
                        label="Empresa Responsável:"
                        label-for="exampleInput6">
            <b-form-input id="exampleInput6"
                          type="text"
                          v-model="form.empresa"
                          required
                          placeholder="Digite o nome da Empresa">
            </b-form-input>
          </b-form-group>

    <br>
        <fieldset><h4>Alvenaria </h4></fieldset>
        <br>

            <b-form-group id="exampleInputGroup7"
                        label="ALvenaria (m²):"
                        label-for="exampleInput7">
            <b-form-input id="exampleInput7"
                          type="number"
                          v-model="form.alvenaria"
                          required
                          placeholder="1500">
            </b-form-input>
          </b-form-group>

          <b-form-group id="exampleInputGroup8"
                        label="Vigas(un):"
                        label-for="exampleInput8">
            <b-form-input id="exampleInput8"
                          type="number"
                          v-model="form.vigas"
                          required
                          placeholder="10">
            </b-form-input>
          </b-form-group>

        <b-form-group id="exampleInputGroup9"
                        label="Pilares (un):"
                        label-for="exampleInput9">
            <b-form-input id="exampleInput9"
                          type="number"
                          v-model="form.pilares"
                          required
                          placeholder="5">
            </b-form-input>
          </b-form-group>
    <br>
      <fieldset><h4>Eletríca </h4></fieldset>
      <br>

            <b-form-group id="exampleInputGroup10"
                        label="Tubulações Eletrícas (m):"
                        label-for="exampleInput10">
            <b-form-input id="exampleInput10"
                          type="number"
                          v-model="form.TubEletrica"
                          required
                          placeholder="1000">
            </b-form-input>
          </b-form-group>

          <b-form-group id="exampleInputGroup11"
                        label="Pontos Eletricos (un):"
                        label-for="exampleInput11">
            <b-form-input id="exampleInput11"
                          type="number"
                          v-model="form.PontEletrica"
                          required
                          placeholder="7000">
            </b-form-input>
          </b-form-group>

    <br>
      <fieldset><h4>Hidraulica</h4></fieldset>
    <br>

            <b-form-group id="exampleInputGroup12"
                        label="Tubulações Hidraulicas (m):"
                        label-for="exampleInput12">
            <b-form-input id="exampleInput12"
                          type="number"
                          v-model="form.TubHidra"
                          required
                          placeholder="200">
            </b-form-input>
          </b-form-group>

          <b-form-group id="exampleInputGroup13"
                        label="Pontos Hidraulicos (un):"
                        label-for="exampleInput13">
            <b-form-input id="exampleInput13"
                          type="number"
                          v-model="form.PontHidra"
                          required
                          placeholder="400">
            </b-form-input>
          </b-form-group>


    <br>
          <fieldset><h4>Revestimento </h4></fieldset>
    <br>
            <b-form-group id="exampleInputGroup14"
                        label="Piso (m²):"
                        label-for="exampleInput14">
            <b-form-input id="exampleInput14"
                          type="number"
                          v-model="form.piso"
                          required
                          placeholder="1000">
            </b-form-input>
          </b-form-group>

          <b-form-group id="exampleInputGroup15"
                        label="Pintura (m²):"
                        label-for="exampleInput15">
            <b-form-input id="exampleInput15"
                          type="number"
                          v-model="form.pintura"
                          required
                          placeholder="3000">
            </b-form-input>
          </b-form-group>

        <b-form-group id="exampleInputGroup16"
                        label="Esquadria (un):"
                        label-for="exampleInput16">
            <b-form-input id="exampleInput16"
                          type="number"
                          v-model="form.esquadria"
                          required
                          placeholder="180">
            </b-form-input>
          </b-form-group>



          <b-button type="submit" variant="primary">Submit</b-button>
          <b-button type="reset" variant="danger">Reset</b-button>
        </b-form>

          </div>
        </div>
      </div>
     </div>
    </div>
  </div>
    

</div>
</template>

<script>
export default {
  name: 'atualizaEdificio',
  data () {

    return {
      form: {
        name_obra: '',
        crea:'',
        fundacao:'',
        user:'',
        obra: null,
        status: null,
        statusFund: null,
        empresa:'',
        alvenaria:'',
        vigas:'',
        pilares:'',
        esquadria:'',
        pintura:'',
        piso:'',
        TubEletrica:'',
        PontEletrica:'',
        TubHidra:'',
        PontHidra:'',
        checked: [],
        edif:null,
      },
        obras: [
        { text: 'Select One', value: null },
        'obra1', 'obra2'
      ],
        Edificacao: [
        { text: 'Select One', value: null },
        'edif1', 'edifi2'
      ],
      show: true,
      selected: '',
      options: [
        { text: 'Nao', value: 'Nao' },
        { text: 'Sim', value: 'Sim' }
      ],
      Status: [
        { text: 'Select One', value: null },
        'ativo', 'desativada'
      ],
       StatusFund: [
        { text: 'Select One', value: null },
        'Irá iniciar','Em andamento', 'Concluida'
      ],
    }
    

  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}

ul {
  list-style-type: none;
  padding: 0;
}

li {
  display: inline-block;
  margin: 0 10px;
}

a {
  color: #42b983;
}
.bg-primary {
  background-color: #17a2b8 !important;
}

.bg-secondary {
  background-color: #056877 !important;
}
b{
  color:white;
}
.mt-3,
.my-3 {
  margin-top: 0rem !important;
}

</style>