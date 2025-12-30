<template>
  <a-layout class="basic-layout">
    <!-- 头部导航栏 -->
    <a-layout-header class="layout-header">
      <GlobalHeader />
    </a-layout-header>

    <!-- 内容区域 -->
    <a-layout-content class="layout-content">
      <router-view />
    </a-layout-content>

    <!-- 底部版权信息 -->
    <a-layout-footer class="layout-footer">
      <GlobalFooter />
    </a-layout-footer>
  </a-layout>
</template>

<script setup lang="ts">
import { Layout as ALayout } from 'ant-design-vue'
import GlobalHeader from '@/components/GlobalHeader.vue'
import GlobalFooter from '@/components/GlobalFooter.vue'
</script>

<style scoped>
.basic-layout {
  min-height: 100vh;
}

.layout-header {
  background: #fff;
  padding: 0;
  height: 64px;
  line-height: 64px;
  box-shadow: 0 1px 4px rgba(0, 21, 41, 0.08);
}

.layout-content {
  flex: 1;
  background: #fff;
  padding: 24px;
  min-height: calc(100vh - 64px - 70px);
}

.layout-footer {
  background: #f0f2f5;
  padding: 16px 24px;
  text-align: center;
}
</style>
