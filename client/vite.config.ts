import react from "@vitejs/plugin-react-swc";
import { defineConfig } from "vite";

// https://vitejs.dev/config/
export default defineConfig({
  plugins: [react()],
  resolve: {
    alias: {
      "#layout": "/src/layout",
      "#pages": "/src/pages",
      "#components": "/src/components",
      "#utils": "/src/utils",
      "#service": "/src/service",
      "#context": "/src/contexts",
      "#hooks": "/src/hooks",
      "#constant": "/src/constant",
      "#assets": "/src/assets",
      "#routes": "/src/routes",
    },
  },
});
