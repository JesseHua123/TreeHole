<template>
  <div>
    <div>
      <rd-cascader :cascader="cascader"></rd-cascader>
    </div>
  </div>
</template>

<script lang="ts">
import { Component, Vue, Prop } from "vue-property-decorator";
const { rdCascader } = require("radon-ui");

@Component({
  components: {
    rdCascader
  }
})
export default class ArticleClassify extends Vue {
  options = [
    {
      value: "china",
      label: "中国",
      children: [
        {
          value: "sichuan",
          label: "四川",
          children: [
            {
              value: "chegndu",
              label: "成都"
            },
            {
              value: "deyang",
              label: "德阳"
            }
          ]
        }
      ]
    },
    {
      value: "America",
      label: "美国",
      children: [
        {
          value: "California",
          label: "加利福尼亚",
          children: [
            {
              value: "lake",
              label: "湖"
            },
            {
              value: "Los Angeles",
              label: "洛杉矶"
            }
          ]
        },
        {
          value: "Delaware",
          label: "特拉华",
          children: [
            {
              value: "Dover",
              label: "多佛"
            }
          ]
        }
      ]
    }
  ];

  private cascader = {
    options: this.options,
    valueArr: []
  };
}
</script>

<style lang="scss" scoped>
</style>