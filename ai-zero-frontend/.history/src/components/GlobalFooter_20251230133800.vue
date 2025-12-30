<template>
  <div class="global-footer">
    <div class="footer-content">
      <p>
        编程导航原创项目 by
        <a
          target="_blank"
          rel="noopener noreferrer"
          class="author-link"
        >
          wyh
        </a>
      </p>
    </div>
  </div>
</template>

<script setup lang="ts">
// 这个组件主要是静态内容，不需要额外的逻辑
</script>

<style scoped>
.global-footer {
  width: 100%;
}

.footer-content {
  max-width: 1200px;
  margin: 0 auto;
  text-align: center;
}

.footer-content p {
  margin: 0;
  color: #666;
  font-size: 14px;
}

.author-link {
  color: #1890ff;
  text-decoration: none;
  font-weight: 500;
}

.author-link:hover {
  text-decoration: underline;
}

/* 响应式设计 */
@media (max-width: 768px) {
  .footer-content p {
    font-size: 12px;
  }
}
</style>
