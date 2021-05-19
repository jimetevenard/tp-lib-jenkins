#!/usr/bin/env groovy

def call() {
    nodejs('node-16') {
        sh 'node -v'
        sh 'npm test'
    }
}