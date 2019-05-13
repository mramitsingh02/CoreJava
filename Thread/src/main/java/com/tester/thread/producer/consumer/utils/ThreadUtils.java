package com.tester.thread.producer.consumer.utils;

import java.util.concurrent.TimeUnit;

public enum ThreadUtils {
    ONE_SECOND {
        @Override
        public void sleep() {
            _sleep(1);
        }
    }, TWO_SECOND {
        @Override
        public void sleep() {
            _sleep(2);
        }
    }, THREE_SECOND {
        @Override
        public void sleep() {
            _sleep(3);
        }
    }, FOUR_SECOND {
        @Override
        public void sleep() {
            _sleep(4);
        }
    }, FIVE_SECOND {
        @Override
        public void sleep() {
            _sleep(5);
        }
    },

    ONE_MINUTE {
        @Override
        public void sleep() {
            _minute(1);
        }
    }, TWO_MINUTE {
        @Override
        public void sleep() {
            _minute(2);
        }
    }, THREE_MINUTE {
        @Override
        public void sleep() {
            _minute(3);
        }
    }, FOUR_MINUTE {
        @Override
        public void sleep() {
            _minute(4);
        }
    }, FIVE_MINUTE {
        @Override
        public void sleep() {
            _minute(5);
        }
    }, TEN_MINUTE {
        @Override
        public void sleep() {
            _minute(10);
        }
    };

    public abstract void sleep();

    protected void _sleep(int unit) {
        try {
            TimeUnit.SECONDS.sleep(unit);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected void _minute(int unit) {
        try {
            TimeUnit.MINUTES.sleep(unit);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}