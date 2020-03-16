  <template>
  <div class="app-container">
    <el-input v-model="filterText" placeholder="Filter keyword" style="margin-bottom:30px;" />
    <el-button type="primary" icon="el-icon-plus" style="margin-bottom:30px; width:400px" @click="dialogFormVisible=true">添加标签</el-button>
    <el-tree
      ref="tree2"
      :data="data2"
      :props="defaultProps"
      :filter-node-method="filterNode"
      class="filter-tree"
      default-expand-all
    />

    <el-dialog title="新增标签" :visible.sync="dialogFormVisible">
      <el-form :model="form">
        <el-form-item label="标签名称" :label-width="formLabelWidth">
          <el-input v-model="form.name" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="父级标签" :label-width="formLabelWidth">
          <el-select v-model="form.region" placeholder="请选择上级标签">
            <el-option label="标签一" value="shanghai"></el-option>
            <el-option label="标签二" value="beijing"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="权限设置" :label-width="formLabelWidth">
          <el-select v-model="form.permission" placeholder="请选择权限">
            <el-option label="权限一" value="shanghai"></el-option>
            <el-option label="权限二" value="beijing"></el-option>
          </el-select>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false">取 消</el-button>
        <el-button type="primary" @click="dialogFormVisible = false">确 定</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
export default {
  data() {
    return {
      filterText: "",
      data2: [
        {
          id: 1,
          label: "Level one 1",
          children: [
            {
              id: 4,
              label: "Level two 1-1",
              children: [
                {
                  id: 9,
                  label: "Level three 1-1-1"
                },
                {
                  id: 10,
                  label: "Level three 1-1-2"
                }
              ]
            }
          ]
        },
        {
          id: 2,
          label: "Level one 2",
          children: [
            {
              id: 5,
              label: "Level two 2-1"
            },
            {
              id: 6,
              label: "Level two 2-2"
            }
          ]
        },
        {
          id: 3,
          label: "Level one 3",
          children: [
            {
              id: 7,
              label: "Level two 3-1"
            },
            {
              id: 8,
              label: "Level two 3-2"
            }
          ]
        }
      ],
      defaultProps: {
        children: "children",
        label: "label"
      },
      dialogFormVisible: false,
      form: {
          name: '',
          region: '',
          date1: '',
          date2: '',
          delivery: false,
          type: [],
          resource: '',
          desc: '',
          permission: ''
      },
      formLabelWidth: '120px'

    };
  },


  watch: {
    filterText(val) {
      this.$refs.tree2.filter(val);
    }
  },

  methods: {
    filterNode(value, data) {
      if (!value) return true;
      return data.label.indexOf(value) !== -1;
    }
  }
};
</script>

