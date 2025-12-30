<template>
  <div class="global-header">
    <div class="header-left">
      <!-- Logo 和标题 -->
      <div class="logo-section">
        <img
          src="/logo.png"
          alt="Logo"
          class="logo"
          @error="handleLogoError"
        />
        <span class="site-title">编程导航</span>
      </div>
    </div>

    <!-- 导航菜单 -->
    <div class="header-center">
      <a-menu
        v-model:selectedKeys="selectedKeys"
        mode="horizontal"
        :items="menuItems"
        class="nav-menu"
        @click="handleMenuClick"
      />
    </div>

    <!-- 用户操作区 -->
    <div class="header-right">
      <a-button type="primary" class="login-btn">
        登录
      </a-button>
    </div>
  </div>
</template>

<script setup lang="ts">
import { ref, reactive } from 'vue'
import { Menu as AMenu, Button as AButton } from 'ant-design-vue'
import { useRouter } from 'vue-router'
import type { MenuProps } from 'ant-design-vue'

const router = useRouter()

// 当前选中的菜单项
const selectedKeys = ref<string[]>(['home'])

// 菜单配置
const menuItems = reactive<MenuProps['items']>([
  {
    key: 'home',
    label: '首页',
  },
  {
    key: 'about',
    label: '关于',
  },
  // 可以在这里添加更多菜单项
])

// 处理菜单点击
const handleMenuClick = ({ key }: { key: string }) => {
  if (key === 'home') {
    router.push('/')
  } else if (key === 'about') {
    router.push('/about')
  }
  // 可以在这里添加更多路由处理
}

// 处理 logo 加载失败
const handleLogoError = (event: Event) => {
  const img = event.target as HTMLImageElement
  img.style.display = 'none'
  console.warn('Logo image not found, hiding logo')
}
</script>

<style scoped>
.global-header {
  display: flex;
  align-items: center;
  justify-content: space-between;
  height: 100%;
  padding: 0 24px;
}

.header-left {
  display: flex;
  align-items: center;
}

.logo-section {
  display: flex;
  align-items: center;
  gap: 8px;
}

.logo {
  height: 32px;
  width: auto;
}

.site-title {
  font-size: 18px;
  font-weight: 600;
  color: #1890ff;
}

.header-center {
  flex: 1;
  display: flex;
  justify-content: center;
}

.nav-menu {
  border-bottom: none;
  background: transparent;
}

.header-right {
  display: flex;
  align-items: center;
}

.login-btn {
  border-radius: 4px;
}

/* 响应式设计 */
@media (max-width: 768px) {
  .global-header {
    padding: 0 16px;
  }

  .site-title {
    font-size: 16px;
  }

  .header-center {
    display: none; /* 移动端隐藏菜单 */
  }

  .logo {
    height: 28px;
  }
}
</style>
