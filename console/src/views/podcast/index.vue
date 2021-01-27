<template>
  <div class="app-container">
    <el-form ref="form" :model="form" label-width="120px">
      <el-form-item label="标题">
        <el-input v-model="form.title" />
      </el-form-item>
       <el-form-item label="讲员">
        <el-input v-model="form.speaker" />
      </el-form-item>
      <el-form-item label="类型">
        <el-select v-model="form.region" placeholder="please select your zone">
          <el-option label="主日证道" value="shanghai" />
          <el-option label="周四查经" value="beijing" />
          <el-option label="圣餐短讲" value="beijing" />
          <el-option label="其他" value="beijing" />
        </el-select>
      </el-form-item>
      <el-form-item label="发布时间">
        <el-col :span="11">
          <el-date-picker v-model="form.publishDate" type="date" placeholder="发布日期" style="width: 100%;" />
        </el-col>
        <el-col :span="2" class="line">-</el-col>
        <el-col :span="11">
          <el-time-picker v-model="form.pulishTime" type="fixed-time" placeholder="发布时间" style="width: 100%;" />
        </el-col>
      </el-form-item>
      <el-form-item label="日期">
        <el-date-picker v-model="form.date" type="date" placeholder="音频日期" style="width: 100%;" />
      </el-form-item>
      <el-form-item label="时长" style="width: 50%;" >
        <el-time-picker v-model="form.time" type="fixed-time" placeholder="时长" />
      </el-form-item>
       <el-form-item label="大小（M）" style="width: 50%;" >
        <el-input v-model="form.size" type="number" />
      </el-form-item>
      <el-form-item label="音频上传">
      
      <el-upload
          class="upload-demo"
          action="uploadUrl"
          :on-preview="handlePreview"
          :on-remove="handleRemove"
          :before-remove="beforeRemove"
          multiple
          :limit="1"
          :on-exceed="handleExceed"
          :file-list="fileList"
          :disabled="upflag"
          >
          <el-button size="small" type="primary" @click="upload">点击上传</el-button>
          <div slot="tip" class="el-upload__tip">只能上传mp3文件</div>
        </el-upload>
      </el-form-item>
        
      
    </el-form>
  </div>
</template>

<script>
export default {
  data() {
    return {
      form: {
        title: '',
        region: '',
        
        delivery: false,
        type: [],
        resource: '',
        desc: '',
        time:'',
        size:'',
        speaker:'',
        fileList: [{name: 'food.jpeg', url: 'https://fuss10.elemecdn.com/3/63/4e7f3a15429bfda99bce42a18cdd1jpeg.jpeg?imageMogr2/thumbnail/360x360/format/webp/quality/100'}, {name: 'food2.jpeg', url: 'https://fuss10.elemecdn.com/3/63/4e7f3a15429bfda99bce42a18cdd1jpeg.jpeg?imageMogr2/thumbnail/360x360/format/webp/quality/100'}],
        publishDate:'',
        pulishTime:'',
        date:'',
       
      },
      upflag:false
    }
  },
  methods: {
    onSubmit() {
      this.$message('submit!')
    },
    onCancel() {
      this.$message({
        message: 'cancel!',
        type: 'warning'
      })
    },
    handleRemove(file, fileList) {
        console.log(file, fileList);
    },
    handlePreview(file) {
      console.log(file);
    },
    handleExceed(files, fileList) {
       this.$message.warning(`只能选择1个文件`);
    },
    beforeRemove(file, fileList) {
      return this.$confirm(`确定移除 ${ file.name }？`);
    },
    upload(){
      //this.upflag = true;
      if(this.upflag){
        return this.$message.warning('请填写完所有信息');
      }
    }
  }
}
</script>

<style scoped>
.line{
  text-align: center;
}
</style>

